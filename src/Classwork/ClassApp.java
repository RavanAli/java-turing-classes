package Classwork;

import java.util.Arrays;
import java.util.Scanner;

public class ClassApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int[][] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = b;
                System.out.print(arr[i][j]);
            }
            b++;
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }
}