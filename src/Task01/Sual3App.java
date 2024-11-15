package Task01;

import java.util.Scanner;

public class Sual3App {
    public static <Char> void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word1 = scanner.next();
        String word2 = word1.toUpperCase();
        System.out.println(word2);
        for (int i = word2.length() - 1; i >= 0  ; i--) {
            char word3 = word2.charAt(i);
            System.out.print(word3);
        }

    }
}