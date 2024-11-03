package Eolymp;

import java.util.Scanner;

public class BucksintheBankApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        long total = 1;
        long given = 1;
        int birthday = 1;

        while(total < S){
            birthday++;
            given = 2 * given + birthday;
            total =+given;
        }
        System.out.println(birthday);

    }
}
