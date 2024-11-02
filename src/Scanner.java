public class Scanner {

    public static void main (String[] args){

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a number: \t");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum1 = num1 + num2;
        System.out.println("Sum is: " + sum1);

        System.out.println(sum1 % 2 == 0 ? "Even" : "Odd");

    }

}
