package com.solvd.university.roomschedule;

import com.solvd.university.classrooms.Classroom;
import com.solvd.university.courses.Subject;

public class RoomSchedule {
    private Subject subject;
    private int fromHour;
    private int toHour;
    private Classroom classroomNumber;
    
    public RoomSchedule(Subject subject, int fromHour, int toHour, Classroom classroomNumber) {
        this.subject = subject;
        this.fromHour = fromHour;
        this.toHour = toHour;
        this.classroomNumber = classroomNumber;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getFromHour() {
        return fromHour;
    }

    public void setFromHour(int fromHour) {
        this.fromHour = fromHour;
    }

    public int getToHour() {
        return toHour;
    }

    public void setToHour(int toHour) {
        this.toHour = toHour;
    }

    public Classroom getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(Classroom classroomNumber) {
        this.classroomNumber = classroomNumber;
    }
    
}

