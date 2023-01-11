package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int employeeCheck = (int) (Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        if (employeeCheck == 0) {
            System.out.println("Employee is absent.");
        }
        else {
            System.out.println("Employee is present.");
        }
    }
}
