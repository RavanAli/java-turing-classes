package WeeklyTasks01;

import java.util.Scanner;

public class EasyTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int colum = scanner.nextInt();

        int[][] den = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                den[i][j] = scanner.nextInt();
            }
        }
        int[][] cedvel = new int[row][colum];

    }
}
