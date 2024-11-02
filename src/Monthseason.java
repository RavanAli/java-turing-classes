import java.util.Scanner;

public class Monthseason {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number == 1){
            System.out.println("Your month and season: January, Winter  ");
        }
         else if(number == 2){
            System.out.println("Your month and season: February,Winter ");
        }
        else if(number == 3){
            System.out.println("Your month and season: March, Spring ");
        }
        else if(number == 4){
            System.out.println("Your month and season: April, Spring");
        }
        else if(number == 5){
            System.out.println("Your month and season: May, Spring");
        }
        else if(number == 6){
            System.out.println("Your month and season: June, Summer");
        }
        else if(number == 7){
            System.out.println("Your month and season: July, Summer");
        }
        else if(number == 8){
            System.out.println("Your month and season: August, Summer");
        }
        else if(number == 9){
            System.out.println("Your month and season: September, Autumn");
        }
        else if(number == 10){
            System.out.println("Your month and season: October, Autumn");
        }
        else if(number == 11){
            System.out.println("Your month and season: November, Autumn");
        }
        else if(number == 12){
            System.out.println("Your month and season: December, Winter");
        }else {
            System.out.println("Enter number from 1 to 12");
        }

    }
}
