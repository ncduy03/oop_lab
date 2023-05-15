import java.util.Scanner;
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        double num1, num2, sum, difference, product, quotient;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        num2 = scanner.nextDouble();

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}