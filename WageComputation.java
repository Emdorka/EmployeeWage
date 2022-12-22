package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        final int WAGE_PER_HOUR = 20;
        final int WORKING_HOUR = 8;
        final int PART_TIME = 4;
        int dailyWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == 1) {
            dailyWage = WAGE_PER_HOUR * WORKING_HOUR;
            System.out.println("Employee is present " );
            } else if ( empCheck == 2) {
            System.out.println(" Employee is part - time ");
            dailyWage = WORKING_HOUR * PART_TIME;
        } else {
                System.out.println("Employee is absent");
            }
        System.out.println(" Employee daily wage is " + dailyWage);
        }
    }
