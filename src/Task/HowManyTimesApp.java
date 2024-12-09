package Task;

import java.util.Scanner;

public class HowManyTimesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(n > 0){
            n -= sumofDigits(n);
            count++;
        }
        System.out.println(count);
    }
    private static int sumofDigits(int num){
        int sum = 0;
        while (num > 10){
            sum +=num % 10;
            num /= 10;
        }
        return num;
    }
}
