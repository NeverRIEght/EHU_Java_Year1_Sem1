package edu.training.jc.exercise04;

//put imports here

//Given an integer number.
//Output the last digit of a number.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Integer input = sc.nextInt();
            System.out.println(Math.abs(input) % 10);
        }
    }
}
