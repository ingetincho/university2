package com.solvd.university.enums;

public enum Days { 
    
    
    MONDAY(8.00,22.00),
    TUESDAY(8.00,22.00),
    WEDNESDAY(8.00,22.00),
    THURSDAY(8.00,22.00),
    FRIDAY(8.00,22.00),
    SATURDAY(8.00,22.00);
    
    public final double start;
    public final double finish;
    
    private Days(double start, double finish) {
        this.start = start;
        this.finish = finish;
    }

    public double getStart() {
        return start;
    }

    public double getFinish() {
        return finish;
    }

}
