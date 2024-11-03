package Eolymp;
import java.util.Scanner;

public class SumofDigitsApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 digit number: ");
        int num = scanner.nextInt();
        int sum = num/1000 + num%10;
        System.out.println(sum);
    }
}
