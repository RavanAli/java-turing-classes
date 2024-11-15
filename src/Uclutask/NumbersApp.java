package Uclutask;

import java.util.Scanner;
import java.util.Random;

public class NumbersApp {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");

        System.out.print("Name: ");
        Scanner scanner =new Scanner(System.in);
        String name = scanner.next();

        Random random =new Random();
        int randomNum = random.nextInt(100);

        int[] guesses = new int[100];
        int guess = 0;

        while(true){
            System.out.println("Enter a number: ");

            while(!scanner.hasNextInt()){
                System.out.println("Please enter a number: ");
                scanner.next();
            }
            int num = scanner.nextInt();
            guesses[guess++] = num;
            if (num > randomNum){
                System.out.println("Your number is to big. Please, try again..");
            } else if (num < randomNum) {
                System.out.println("Your number is to small. Please, try again..");
            }else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.println("Your numbers:");
        sortArrayDescending(guesses, guess);
        for (int i = 0; i < guess; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }

    private static void sortArrayDescending(int[] array, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
