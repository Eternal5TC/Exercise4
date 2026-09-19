import java.util.Scanner;
import java.lang.Math;


class Quadratic {
    double a, b, c;

    Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double Delta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    void Calculation() {
        double delta = Delta(a, b, c);
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            double x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.println("X1 = X2 = " + x);
        } else {
            System.out.println("This equation root are complex");
        }
    }
}

public class JAVA_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double a, b, c;


            System.out.println("Program for calculating roots of quadratic equation ");
            System.out.println("x^2+ bx +c=0");
            System.out.print("Input #a: ");
            a = scanner.nextDouble();
            System.out.print("Input #b: ");
            b = scanner.nextDouble();
            System.out.print("Input #c: ");
            c = scanner.nextDouble();

            Quadratic q1 = new Quadratic(a, b, c);
            q1.Calculation();

            scanner.close();
        }
}
