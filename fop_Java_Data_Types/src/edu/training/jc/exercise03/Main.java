package edu.training.jc.exercise03;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double length = sc.nextDouble();
            double width = length / 2;

            double area = length * width;
            System.out.println(String.format("%.3f", area));
        }
    }
}
