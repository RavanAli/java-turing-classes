package Eolymp;

import java.util.Scanner;

public class FirstorLastApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num/100 > num%10){
            System.out.println(num/100);
        } else if (num%10 > num/100) {
            System.out.println(num%10);
        }else{
            System.out.println("First and last digits are equal");
        }
    }
}
