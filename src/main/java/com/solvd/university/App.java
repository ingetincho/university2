package com.solvd.university;

import com.solvd.university.courses.Subject;
import com.solvd.university.databases.TeachersList;
import com.solvd.university.persons.Student;
import com.solvd.university.persons.Teacher;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        TeachersList teachersList = new TeachersList();

        teachersList.addTeacher(new Teacher("Juan", "Perez", 125000.0));
        teachersList.addTeacher(new Teacher("Ceci", "Kissner", 125000.0));
        teachersList.addTeacher(new Teacher("Martin", "Leg", 125000.0));
        
        log.info("List of Teachers");
        teachersList.listOfTeachers();    

        Student juan = new Student("Juan", "Leg");
        Student maria = new Student("Maria", "Kissner");

        log.info(juan.getIdStudent());
        log.info(maria.getIdStudent());

        Subject mathematicsA = new Subject("Mathematics A", 100, 180);
        Subject algebraA = new Subject("Algebra A", 107, 150);
        Subject physicsA = new Subject("Physics", 123, 200);

        juan.addSubject(mathematicsA);
        juan.addSubject(physicsA);
        juan.addSubject(mathematicsA);
        juan.addSubject(algebraA);
        
        juan.listSubjects();

        maria.addSubject(new Subject("Java Level 1", 142, 210));
        maria.addSubject(new Subject("Java Level 1", 142, 210));
        maria.listSubjects();





    }
}
