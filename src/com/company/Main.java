package com.company;

import com.company.classes.School;
import com.company.classes.Student;
import com.company.classes.Teacher;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        School:
            Teachers,
            Students,
            Money in,
            Money out

        Teachers:
            id,
            name,
            salary

        Students:
            id,
            name,
            grade,
            fees paid,
            fees total
         */

	// write your code here

        Teacher cliff = new Teacher(1L, "Cliff", 700L);
        Teacher gabe = new Teacher(2L, "Gabe", 500L);
        Teacher arnell = new Teacher(3L, "Arnell", 1000L);

        List<Teacher> teachers = Arrays.asList(
                cliff,
                gabe,
                arnell
        );

        Student sergio = new Student(1L, "Sergio", "CH12");
        Student travis = new Student(2L, "Travis", "CH12");
        Student keith = new Student(3L, "Keith", "CH12");

        List<Student> students = Arrays.asList(
                sergio,
                keith,
                travis
        );

        School careerDevs = new School(teachers, students);

        sergio.payFees(5000L);

        System.out.println(careerDevs.getMoneyIn());

        keith.payFees(6000L);

        System.out.println(careerDevs.getMoneyIn());

        System.out.println("~~~~~~~~~~CareerDevs Payout~~~~~~~~~~~");

        arnell.receiveSalary(arnell.getSalary());

        System.out.println(careerDevs.getMoneyIn());



    }
}
