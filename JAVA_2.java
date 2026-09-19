import java.util.Scanner;

public class JAVA_2 {
    // Sum
    static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // Average
    static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    // Maximum
    static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Minimum
    static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many number to be input? ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Value #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Results
        System.out.println();
        System.out.println("Max: " + max(numbers));
        System.out.println("Min: " + min(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Sum: " + sum(numbers));

        input.close();
    }
}
