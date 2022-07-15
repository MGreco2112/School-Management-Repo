package com.company.classes;

import java.util.ArrayList;
import java.util.List;

public class School {
    //responsible for holding Teacher and Student lists and keeping track of money flow

    private List<Teacher> teachers;
    private List<Student> students;
    private Long moneyIn;
    private Long moneyOut;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        moneyIn = 0L;
        moneyOut = 0L;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addStudent(Student student) {
        students.add(student);
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

    public void updateMoneyIn(Long money) {
        moneyIn += money;
    }

    public void setMoneyIn(Long moneyIn) {
        this.moneyIn = moneyIn;
    }

    public Long getMoneyOut() {
        return moneyOut;
    }

    public void updateMoneyOut(Long money) {
        moneyOut -= money;
    }

    public void setMoneyOut(Long moneyOut) {
        this.moneyOut = moneyOut;
    }
}
