import java.util.Scanner;
public class LinearSystem {
    public static void main(String[] args) {
        double a11, a12, b1, a21, a22, b2, x1, x2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a11 = ");
        a11 = scanner.nextDouble();
        System.out.print("a12 = ");
        a12 = scanner.nextDouble();
        System.out.print("b1 = ");
        b1 = scanner.nextDouble();

        System.out.println("Enter the coefficients for the second equation:");
        System.out.print("a21 = ");
        a21 = scanner.nextDouble();
        System.out.print("a22 = ");
        a22 = scanner.nextDouble();
        System.out.print("b2 = ");
        b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double Dx1 = b1 * a22 - b2 * a12;
        double Dx2 = a11 * b2 - a21 * b1; 

        if (D == 0) {
            if (Dx1 == 0 && Dx2 == 0) {
                System.out.println("Infinitely many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            x1 = Dx1 / D;
            x2 = Dx2 / D;
            System.out.println("Unique solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
