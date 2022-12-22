package com.bridgelabz.empwage;

public class WageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");
        double empCheck =  Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
