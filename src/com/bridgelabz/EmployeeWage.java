package com.bridgelabz;

public class EmployeeWage {

    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 7;
    static final int IS_PART_TIME = 2;
    static final int IS_FULL_TIME = 1;
    static final int IS_ABSENT = 0;
    static int totalWage = 0;
    /*
    Declaring the method with three parameters.
    So that we can calculate daily wages of multiple companies.
     */
    static void calculateWage(int wage, int workingDays, int workingHours) { //Calculating Wage inside the class level method.
        int dayCount = 1;
        int dailyWage;
        int workingHour = 0;
        while (dayCount <= workingDays && workingHour < workingHours) {
            int employeeCheck = (int) (Math.random() * 10) % 3;
            System.out.println(employeeCheck);
            switch (employeeCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    dailyWage = wage * PART_TIME_HOUR;
                    workingHour = workingHour + PART_TIME_HOUR;
                    totalWage = totalWage + dailyWage;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Full Time");
                    dailyWage = wage * FULL_DAY_HOUR;
                    workingHour = workingHour + FULL_DAY_HOUR;
                    totalWage = totalWage + dailyWage;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    dailyWage = wage * IS_ABSENT;
                    workingHour = workingHour + IS_ABSENT;
                    totalWage = totalWage + dailyWage;
            }
            System.out.println("Daily wage of Day => " + dayCount + " is " + dailyWage);
            System.out.println("Working hours is: " + workingHour);
            dayCount++;
        }
        System.out.println("Total wage of the company is: " +totalWage);

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");
        calculateWage(200, 28, 200);
        calculateWage(2000, 25, 300);// calculating daily wage of multiple company.
    }
}
