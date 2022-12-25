package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        int empHrs;
        int monthlyWage = 0;
        final int wagePerHr = 20;
        final int workingDays = 20;
        final int workingHr = 100;
        int totalWorkingHr = 0;
        int totalWorkingDay = 0;
        while (totalWorkingDay < workingDays && totalWorkingHr < workingHr) {
            totalWorkingDay++;
           {
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
                        default:
                            System.out.println(" Employee is Absent ");
                            empHrs = 0;
                    }
                    totalWorkingHr = empHrs + totalWorkingHr;
                    System.out.println("working day " + totalWorkingDay + "  and hour is " + empHrs);
                }
                int totalWagesForMonth = totalWorkingHr * wagePerHr;
                System.out.println(" Monthly employee wage " + totalWagesForMonth);
            }
        }
    }