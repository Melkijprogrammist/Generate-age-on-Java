import java.util.Scanner;

public class AgeGenerator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input  your age: ");

            int birthYear = scanner.nextInt();

            int currentYear = 2024; // Замените на текущий год
            int age = currentYear - birthYear;

            System.out.println("Your  age is: " + age);

        }
    }
}
