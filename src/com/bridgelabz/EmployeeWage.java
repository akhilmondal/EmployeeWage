package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 7;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int employeeCheck = (int) (Math.random() * 10) % 3;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if (employeeCheck == 1) {
            System.out.println("Employee is in full time.");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        } else if (employeeCheck == 2){
            System.out.println("Employee is in part time.");
            dailyWage = PART_TIME_HOUR * WAGE_PER_HOUR;
        }else {
            System.out.println("Employee is absent.");
        }
        System.out.println("Daily wage of the employee is:  " +dailyWage);
    }
}
