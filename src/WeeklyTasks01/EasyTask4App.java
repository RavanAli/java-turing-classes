package WeeklyTasks01;

import java.util.Scanner;

public class EasyTask4App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int agac = number;
        int n = 0;
        float sum = 0.0f;
        if (number==2 || number == 1 || number == 0){
            System.out.println(number);
        }else {
            while(agac>2){
                sum = sum + (1.0f/agac);
                agac--;
                n++;
                if (sum>0.5)break;
            }
            System.out.println(number-n);
        }
    }
}
