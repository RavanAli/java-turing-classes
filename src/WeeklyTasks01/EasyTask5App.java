package WeeklyTasks01;

import java.util.Scanner;

public class EasyTask5App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        double result = (double) n /m;
        System.out.printf("%." + k + "f\n" , result);
    }
}
