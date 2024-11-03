package Eolymp;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SquareRootApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive 3 digit number: ");
        long num = scanner.nextLong();
        long a = num/100;
        long b = (num%100)/10;
        long c = num %10;
        long sum = (a^2)+(b^2)+(c^2);
        System.out.printf(" %.3f\n", sqrt(sum));
    }
}
