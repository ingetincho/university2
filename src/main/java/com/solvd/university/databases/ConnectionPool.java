package com.solvd.university.databases;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class ConnectionPool {

    private static final Logger log = Logger.getLogger(ConnectionPool.class);

    
    private static ConnectionPool connectionPool;
    private static int connectionCounter = 0;


    private static final int MAX_CONNECTIONS = 5;
    private static List<Connection> connections = new ArrayList<>(MAX_CONNECTIONS);


    public ConnectionPool() {
    }

    public static ConnectionPool getInstance() {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        
        return connectionPool;
    }

    public synchronized Connection getConnection() {
        if (!connections.isEmpty()) {
            return connections.stream().findFirst().get();
        } else if (connectionCounter == MAX_CONNECTIONS) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(2000); //2 seconds
                    if (!connections.isEmpty()) {
                        return connections.stream().findFirst().get();
                    }
                } catch (InterruptedException e) {
                    log.error("Thread error", e);
                }
            }
            throw new RuntimeException("");
        } else {
            connectionCounter++;
            return new Connection();
        }
    }

    public synchronized void returnConnection(Connection connection) {
        connections.add(connection);
    }
    
}
