package Task;

import java.util.Scanner;

public class ValueOfVariable3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double a = x*x + 3*x - 4;
    double b = 2*x - 3;
    double c = x + 2;
    double d = x*x - 5*x + 7;
    double y = (a/b) - (c/d);
        System.out.printf("%.3f%n", y);
    }
}
