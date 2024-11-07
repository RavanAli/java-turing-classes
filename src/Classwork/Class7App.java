package Classwork;

public class Class7App {

    public static void main(String[] args){

        int[] numbers = {1, 34, 7945, 7636, 445, 4837, 677,83,12};
        int max = 0;

        for (int i = 0 ; i< numbers.length; i++){

            if (numbers[i]>max){

                max = numbers[i];
            }
        }
        System.out.println(max);


    }
}