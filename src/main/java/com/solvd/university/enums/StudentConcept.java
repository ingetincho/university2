package com.solvd.university.enums;

public enum StudentConcept {
    EXCELENT(10),
    GREATJOB(9),
    APPROVED(8),
    GOOD(7),
    AVERAGE(6),
    NOTGOOD(5),
    BAD(4),
    VERYBAD(3),
    NOTAPPROVED(2),
    TRYAGAIN(1);

    private final int concept;

    StudentConcept (int concept){
        this.concept = concept;
    }

    public int getConcept() {
        return concept;
    }

    
}
