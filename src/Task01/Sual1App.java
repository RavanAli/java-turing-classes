package Task01;

import java.util.Scanner;

public class Sual1App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word1 = scanner.next();
        char last = word1.charAt(word1.length() - 1);
        System.out.println("Last char is: ");
        System.out.println(last);

    }
}
