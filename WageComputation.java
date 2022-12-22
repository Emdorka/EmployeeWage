package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        final int WAGE_PER_HOUR = 20;
        final int WORKING_HOUR = 8;
        int dailyWage = 0 ;
        double empCheck =  Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            //System.out.println("Employee is present " + dailyWage);
            dailyWage = WAGE_PER_HOUR * WORKING_HOUR;
            System.out.println("Employee is present " + dailyWage);
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
