package Eolymp;

import java.util.Scanner;

public class SimpleProblemApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter a number: ");
        System.out.println(number/10 +" "+ number%10 );
    }
}
