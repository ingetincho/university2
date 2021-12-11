package com.solvd.university.classrooms;

import com.solvd.university.roomschedule.RoomSchedule;

public class Classroom {
    private int number;
    private RoomSchedule roomclasSchedule;
    private static final int MAX_STUDENTS = 10;

    public Classroom(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomSchedule getRoomclasSchedule() {
        return roomclasSchedule;
    }

    public void setRoomclasSchedule(RoomSchedule roomclasSchedule) {
        this.roomclasSchedule = roomclasSchedule;
    }

    public int getMaxStudents() {
        return MAX_STUDENTS;
    }

}

