package com.solvd.university.databases;

import org.apache.log4j.Logger;

public class Connection implements Runnable{
    
    private static final Logger log = Logger.getLogger(Connection.class);
    
    private String ping = "Ping";
    private String auth = "Auth";
    private String executingQuery = "Executing Query";
    private String close = "Close";

    public Connection() {
    }

    @Override
    public void run() {
        log.info(pingDB());
        log.info(auth());
        log.info(executeQuery());
        log.info(close());
    }

    private String pingDB() {
        return ping;
    }

    private String auth() {
        return auth;
    }

    private String executeQuery() {
        return executingQuery;
    }

    private String close() {
        return close;
    }
}
