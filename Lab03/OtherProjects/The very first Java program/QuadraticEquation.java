import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("No real roots.");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Double root: x = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}

