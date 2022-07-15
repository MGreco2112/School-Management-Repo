package com.company.classes;

public class Teacher {
    //responsible for keeping track of Teacher demographic information and their salary value

    private final Long id;
    private String name;
    private Long salary;
    private Long salaryEarned = 0L;

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

    public Long getSalaryEarned() {
        return salaryEarned;
    }

    public void setSalaryEarned(Long salaryEarned) {
        this.salaryEarned = salaryEarned;
    }

    public void receiveSalary(Long salary) {
        this.salaryEarned += salary;
        School.updateMoneyOut(salary);
    }

    public String toString() {
        return name + ") salary: $" + salary;
    }
}
