package com.company.classes;

public class Student {
    //responsible for keeping track of Students demographic and monetary information

    private Long id;
    private String name;
    private String grade;
    private Long feesPaid;
    private Long feesTotal;

    public Student(Long id, String name, String grade, Long feesPaid, Long feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = feesPaid;
        this.feesTotal = feesTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(Long feesPaid) {
        this.feesPaid = feesPaid;
    }

    public Long getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(Long feesTotal) {
        this.feesTotal = feesTotal;
    }
}
