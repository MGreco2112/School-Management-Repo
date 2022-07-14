package com.company.classes;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private Long moneyIn;
    private Long moneyOut;

    public School(Long moneyIn, Long moneyOut) {
        this.moneyIn = moneyIn;
        this.moneyOut = moneyOut;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Long getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(Long moneyIn) {
        this.moneyIn = moneyIn;
    }

    public Long getMoneyOut() {
        return moneyOut;
    }

    public void setMoneyOut(Long moneyOut) {
        this.moneyOut = moneyOut;
    }
}
