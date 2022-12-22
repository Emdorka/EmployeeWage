package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        final int WORKING_HR =8;
        final int  DAILY_PER_HR = 20;
        int dailyWage = 0;
        double empCheck =  Math.floor(Math.random() * 10) % 2;
        //dailyWage = WORKING_HR * DAILY_PER_HR;
        if (empCheck == 1) {
            dailyWage = WORKING_HR * DAILY_PER_HR;
            System.out.println("Employee is present " + dailyWage);
            //dailyWage = WORKING_HR * DAILY_PER_HR;
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
