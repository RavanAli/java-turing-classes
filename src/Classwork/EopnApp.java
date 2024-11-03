package Classwork;

import java.util.Scanner;

public class EopnApp {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number %2 ==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }

        if (number >0){
            System.out.println("Your number is positive");
        } else if (number <0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is 0");
        }

    }
}
