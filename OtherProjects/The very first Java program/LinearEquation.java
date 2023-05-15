import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args) {
        double a, b, x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinitely many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            x = -b / a;
            System.out.println("Unique solution: x = " + x);
        }
    }
}