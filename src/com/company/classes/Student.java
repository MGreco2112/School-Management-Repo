package com.company.classes;

public class Student {
    //responsible for keeping track of Students demographic and monetary information

    private final Long id;
    private String name;
    private String grade;
    private Long feesPaid;
    private Long feesTotal;

    public Student(Long id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0L;
        feesTotal = 30000L;
    }

    public Long getId() {
        return id;
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

    public void payFees(Long fee) {
        this.feesPaid += fee;
        School.updateMoneyIn(feesPaid);
    }

    public Long getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(Long feesTotal) {
        this.feesTotal = feesTotal;
    }

    public Long getRemainingFees() {
        return feesTotal - feesPaid;
    }

}
