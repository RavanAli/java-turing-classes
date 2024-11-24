package WeeklyTasks01;

import java.util.Scanner;

public class EasyTask6App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int h = sc.nextInt();


        if(x1 < x2 || x1 > x3){
            System.out.println("0.000");
            return;
        }
        double yBottom = Math.max(y0, y3);
        double yTop = Math.min(y1, y2 + h);

        if(yTop < yBottom){
            System.out.println("0.000");
        }else {
            double tearLength = yTop - yBottom;
            System.out.printf("%.3f\n", tearLength );
        }


    }
}
