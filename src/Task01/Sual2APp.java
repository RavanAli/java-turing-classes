package Task01;

import java.util.Locale;
import java.util.Scanner;

public class Sual2APp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word1 = scanner.nextLine();

        char[] vowels = {'a', 'e', 'u', 'i', 'o','A','E','U','I','O'};
        char last = word1.charAt(word1.length() - 1);

        boolean isVowel = false;

        for (int i = 0; i <vowels.length ; i++) {
            if (last == vowels[i]){
                isVowel =true;
                break;
            }


        }
        if (isVowel) System.out.println("vowel");
        else System.out.println("not vowel");


        }
    }

