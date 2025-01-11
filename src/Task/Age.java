package Task;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[50];
        int count = 0;

        System.out.println("Yaşları daxil edin (daxil etməyi dayandırmaq üçün 'stop' və ya 'exit' yazın):");

        while (true) {
            if (count >= 50) {
                System.out.println("Maksimum 50 yaş daxil edə bilərsiniz.");
                break;
            }

            System.out.print("Yaş daxil edin: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int age = Integer.parseInt(input);

                if (age < 0) {
                    throw new IllegalArgumentException("Yaş mənfi ola bilməz.");
                }
                if (age > 200) {
                    throw new ArithmeticException("Yaş çox böyükdür.");
                }

                ages[count] = age;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Yanlış giriş! Xahiş olunur, etibarlı bir rəqəm daxil edin.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        if (count == 0) {
            System.out.println("Heç bir yaş daxil edilməyib.");
        } else {
            System.out.println("Daxil edilən yaşlar:");
            for (int i = 0; i < count; i++) {
                System.out.print(ages[i] + " ");
            }
            System.out.println();
            processAges(ages, count);
        }
    }

    private static void processAges(int[] ages, int count) {
        int sum = 0;
        int children = 0, teenagers = 0, adults = 0, seniors = 0;

        System.out.println("Hər yaş üçün ətraflı məlumat:");
        for (int i = 0; i < count; i++) {
            int age = ages[i];

            String factorialResult;
            try {
                factorialResult = calculateFactorial(age);
            } catch (ArithmeticException e) {
                factorialResult = "Faktorial çox böyükdür.";
            }

            String evenOdd = isEven(age) ? "Cüt" : "Tək";

            if (age <= 12) {
                children++;
            } else if (age <= 19) {
                teenagers++;
            } else if (age <= 64) {
                adults++;
            } else {
                seniors++;
            }

            System.out.printf("- Yaş: %d -> Faktorial: %s, %s.\n", age, factorialResult, evenOdd);
            sum += age;
        }

        double average = (double) sum / count;

        System.out.println("\nStatistik Xülasə:");
        System.out.println("- Ümumi insan sayı: " + count);
        System.out.println("- Yaşların cəmi: " + sum);
        System.out.printf("- Orta yaş: %.2f\n", average);
        System.out.println("- Yaş Qrupları Statistikası:");
        System.out.println("  * Uşaqlar: " + children + " nəfər");
        System.out.println("  * Yeniyetmələr: " + teenagers + " nəfər");
        System.out.println("  * Böyüklər: " + adults + " nəfər");
        System.out.println("  * Yaşlılar: " + seniors + " nəfər");
    }

    private static String calculateFactorial(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Mənfi ədədlərin faktorialı yoxdur.");
        }

        long factorial = 1;
        for (int i = 1; i <= age; i++) {
            factorial *= i;
            if (factorial < 0) {
                throw new ArithmeticException("Faktorial çox böyükdür.");
            }
        }
        return String.valueOf(factorial);
    }

    private static boolean isEven(int age) {
        return age %2==0;
    }
}
