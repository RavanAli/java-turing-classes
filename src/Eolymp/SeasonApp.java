package Eolymp;
import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;

        switch (month){
            case 1: case 2: case 12:
                season = "Winter";
                break;
            case 3: case 4: case 5:
                season = "Spring";
                break;
            case 6: case 7: case 8:
                season = "Summer";
                break;
            case 9: case 10: case 11:
                season = "Autumn";
                break;
            default:
                season="Choose number from 1 to 12";
                break;
        }
        System.out.println("Your season is " +season);
    }
}
