package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        final int WAGE_PER_HOUR = 20;
        final int WORKING_HOUR = 8;
        final int PART_TIME = 4;
        int dailyWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
        switch (empCheck) {
            case 1: {
                System.out.println("Employee is present ");
                dailyWage = WORKING_HOUR * WAGE_PER_HOUR;
            }
             break;
            case 2: {
                System.out.println(" Employee is part - time ");
                dailyWage = WORKING_HOUR * PART_TIME;
            }
            break;
            case 0: {
                System.out.println(" Employee is Absent " );
            }
        }
        System.out.println( "Employee daily wage is " + dailyWage);
    }
}
