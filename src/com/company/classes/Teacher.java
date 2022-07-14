package com.company.classes;

public class Teacher {
    //responsible for keeping track of Teacher demographic information and their salary value

    private final Long id;
    private String name;
    private Long salary;

    public Teacher(Long id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
