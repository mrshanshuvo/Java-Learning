import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        int num1, num2, result;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            num1 = input.nextInt();
            System.out.print("Enter Second Number: ");
            num2 = input.nextInt();

            result = num1 + num2;
            System.out.println("Summation : " + result);

            result = num1 - num2;
            System.out.println("Substraction: " + result);

            result = num1 * num2;
            System.out.println("Multiplication: " + result);

            result = num1 / num2;
            System.out.println("Division: " + result);

            result = num1 % num2;
            System.out.println("Remaminder: " + result);
        }
    }
}
