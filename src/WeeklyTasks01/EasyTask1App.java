package WeeklyTasks01;

import java.util.Scanner;

public class EasyTask1App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.printf("%d %d\n", number/10, number%10);
    }
}
