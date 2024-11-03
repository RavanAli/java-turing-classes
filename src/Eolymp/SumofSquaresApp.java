package Eolymp;

import java.util.Scanner;

public class SumofSquaresApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = num1*num1 +num2*num2;
        System.out.println(num3);
    }
}
