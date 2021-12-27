package com.solvd.university;

import com.solvd.university.courses.Subject;
import com.solvd.university.databases.TeachersList;
import com.solvd.university.enums.Days;
import com.solvd.university.enums.StudentConcept;
import com.solvd.university.lookforwords.LookFor;
import com.solvd.university.persons.Student;
import com.solvd.university.persons.Teacher;
import com.solvd.university.roomschedule.RoomSchedule;
import com.solvd.university.threads.MyCustomThread;
import com.solvd.university.classrooms.Classroom;
import com.solvd.university.courses.MenuSubjects;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class);

    
    public static void main(String[] args) {

        BasicConfigurator.configure();

        MenuSubjects menu = new MenuSubjects();
        
        menu.subjectsMenu();

        TeachersList teachersList = new TeachersList();

        teachersList.addTeacher(new Teacher("Juan", "Perez", 125000.0));
        teachersList.addTeacher(new Teacher("Ceci", "Kissner", 125000.0));
        teachersList.addTeacher(new Teacher("Martin", "Leg", 125000.0));
        
        log.info("List of Teachers");
        teachersList.listOfTeachers();    

        Classroom one = new Classroom();
        
        one.setNumber(1);

        Student juan = new Student("Juan", "Leg");
        Student maria = new Student("Maria", "Kissner");

        maria.setConcept(StudentConcept.EXCELENT);
        juan.setConcept(StudentConcept.AVERAGE);

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

        
        MyCustomThread thread1 = new MyCustomThread();
        MyCustomThread thread2 = new MyCustomThread();
        MyCustomThread thread3 = new MyCustomThread();
        MyCustomThread thread4 = new MyCustomThread();
        MyCustomThread thread5 = new MyCustomThread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
 
        LookFor search = new LookFor();
        search.search();


        RoomSchedule physicsSchedule = new RoomSchedule();

        physicsSchedule.setClassroomNumber(one);
        physicsSchedule.setDay(Days.MONDAY);


    }
}
