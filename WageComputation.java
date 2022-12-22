package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        int empHrs;
        int dailyWage;
        int monthlyWage = 0;
        int wagePerHr = 20;
        int workingDays = 20;
        for (int i = 0; i < workingDays; i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(empCheck);
            switch (empCheck) {
                case 1: {
                    System.out.println("Employee is present ");
                    empHrs = 8;
                    break;
                }
                case 2: {
                    System.out.println(" Employee is part - time ");
                    empHrs = 4;
                    break;
                }
                case 0: {
                    System.out.println(" Employee is Absent ");
                    empHrs = 0;
                }
                dailyWage = empHrs * wagePerHr;
                monthlyWage = dailyWage * workingDays;
                System.out.println(" daily wages is " + dailyWage);
            }
            System.out.println("Employee daily wage is " + monthlyWage);
        }
    }
}