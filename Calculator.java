import java.util.Scanner;

public class Calculator{

    // Methods for operations
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        while (true) {
            System.out.print("Enter what you want to do 1-4: ");
            int choice = scanner.nextInt();

            System.out.print("Enter the value of a: ");
            int a = scanner.nextInt();
            System.out.print("Enter the value of b: ");
            int b = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The result is: " + add(a, b));
                    break;
                case 2:
                    System.out.println("The result is: " + subtract(a, b));
                    break;
                case 3:
                    System.out.println("The result is: " + multiply(a, b));
                    break;
                case 4:
                    System.out.println("The result is: " + divide(a, b));
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
                    continue;
            }

            while (true) {
                System.out.print("Do you want to continue using my calculator? Yes/No: ");
                String ask = scanner.next();
                if (ask.equalsIgnoreCase("yes")) {
                    break;
                } else if (ask.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using our calculator. Bye!");
                    scanner.close();
                    System.exit(0);
                } else {
                    System.out.println("Please enter either yes or no.");
                }
            }
        }
    }
}