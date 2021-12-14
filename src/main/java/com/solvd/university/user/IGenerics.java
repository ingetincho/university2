package com.solvd.university.user;

public interface IGenerics {
    
    String SUBJECTS_FILENAME = "Subjects.txt";

    void add(String nombre);
    void list();
    void search(String search);
    void initFile();
}
