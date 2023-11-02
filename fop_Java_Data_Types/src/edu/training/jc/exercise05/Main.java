package edu.training.jc.exercise05;

//put imports here

//Given an integer number.
//Output the last digit of a number.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();

            String[] strs = input.split(" ");
            Double[] nums = new Double[2];

            for(int i = 0; i < strs.length; i++) {
                nums[i] = Double.parseDouble(strs[i]);
            }

            double sum = a + b;
            double diff = a - b;
            double product = a * b;
            double quotient = a / b;

            System.out.println(String.format("%.3f %.3f %.3f %.3f", sum, diff, product, quotient));
        }
    }
}
