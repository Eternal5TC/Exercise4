
class Math2{
    static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
    }
    static double rectangleSurface(double Width, double Height){
        return Width * Height;
    }
    static double circleSurface(double Radius){
        return Radius * Radius * 3.14;
    }
    static int max(int a, int b, int c, int d, int e) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }
        return max;
    }
    static int min(int a, int b, int c, int d, int e) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        if (e < min) {
            min = e;
        }
        return min;
    }
}

public class JAVA_6 {
    public static void main(String[] args) {
        System.out.println("Factorial: "+ Math2.factorial(5));

        System.out.println("Rectangle Surface: "+ Math2.rectangleSurface(10, 5));

        System.out.println("Circle Surface: " + Math2.circleSurface(5));

        System.out.println("Maximum: "+ Math2.max(10, 25, 7, 40, 15));

        System.out.println("Minimum: "+ Math2.min(10, 25, 7, 40, 15));
    }
}
