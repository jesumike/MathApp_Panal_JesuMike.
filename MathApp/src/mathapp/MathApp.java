/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathapp;

import java.util.Scanner;

/**
 *
 * @author jesumike
 */
public class MathApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n=== Math App Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Factorial");
            System.out.println("6. Power");
            System.out.println("7. Sum 1 to N");
            System.out.println("8. Prime Check");
            System.out.println("9. GCD");
            System.out.println("10. Absolute Value");
            System.out.println("11. Average of N Numbers");
            System.out.println("12. Maximum of N Numbers");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = getInt(input);

            switch (choice) {

                case 1:
                    // Addition
                    System.out.print("Enter first number: ");
                    double a = getDouble(input);

                    System.out.print("Enter second number: ");
                    double b = getDouble(input);

                    System.out.println("Sum: " + (a + b));
                    break;

                case 2:
                    // Subtraction
                    System.out.print("Enter first number: ");
                    a = getDouble(input);

                    System.out.print("Enter second number: ");
                    b = getDouble(input);

                    System.out.println("Difference: " + (a - b));
                    break;

                case 3:
                    // Multiplication
                    System.out.print("Enter first number: ");
                    a = getDouble(input);

                    System.out.print("Enter second number: ");
                    b = getDouble(input);

                    System.out.println("Product: " + (a * b));
                    break;

                case 4:
                    // Division
                    System.out.print("Enter first number: ");
                    a = getDouble(input);

                    System.out.print("Enter second number: ");
                    b = getDouble(input);

                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Quotient: " + (a / b));
                    }
                    break;

                case 5:
                    // Factorial
                    System.out.print("Enter a number: ");
                    int n = getInt(input);

                    if (n < 0) {
                        System.out.println("Factorial cannot be negative.");
                    } else if (n > 20) {
                        System.out.println("Please enter a number from 0 to 20.");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= n; i++) {
                            factorial = factorial * i;
                        }

                        System.out.println("Factorial: " + factorial);
                    }
                    break;

                case 6:
                    // Power
                    System.out.print("Enter the base: ");
                    a = getDouble(input);

                    System.out.print("Enter the exponent: ");
                    int exponent = getInt(input);

                    double power = 1;

                    for (int i = 1; i <= exponent; i++) {
                        power = power * a;
                    }

                    System.out.println("Result: " + power);
                    break;

                case 7:
                    // Sum from 1 to N
                    System.out.print("Enter N: ");
                    n = getInt(input);

                    if (n < 1) {
                        System.out.println("Enter a number greater than 0.");
                    } else {
                        int sum = 0;

                        for (int i = 1; i <= n; i++) {
                            sum = sum + i;
                        }

                        System.out.println("Sum: " + sum);
                    }
                    break;

                case 8:
                    // Prime check
                    System.out.print("Enter a number: ");
                    n = getInt(input);

                    boolean prime = true;

                    if (n < 2) {
                        prime = false;
                    } else {
                        for (int i = 2; i < n; i++) {
                            if (n % i == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }

                    if (prime) {
                        System.out.println("Prime number.");
                    } else {
                        System.out.println("Not a prime number.");
                    }
                    break;

                case 9:
                    // GCD
                    System.out.print("Enter first number: ");
                    int x = getInt(input);

                    System.out.print("Enter second number: ");
                    int y = getInt(input);

                    x = Math.abs(x);
                    y = Math.abs(y);

                    while (y != 0) {
                        int remainder = x % y;
                        x = y;
                        y = remainder;
                    }

                    System.out.println("GCD: " + x);
                    break;

                case 10:
                    // Absolute value
                    System.out.print("Enter a number: ");
                    a = getDouble(input);

                    System.out.println("Absolute value: " + Math.abs(a));
                    break;

                case 11:
                    // Average
                    System.out.print("How many numbers? ");
                    n = getInt(input);

                    if (n <= 0) {
                        System.out.println("Please enter a number greater than 0.");
                    } else {

                        double[] numbers = new double[n];
                        double total = 0;

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            numbers[i] = getDouble(input);
                            total = total + numbers[i];
                        }

                        System.out.println("Average: " + (total / n));
                    }
                    break;

                case 12:
                    // Maximum
                    System.out.print("How many numbers? ");
                    n = getInt(input);

                    if (n <= 0) {
                        System.out.println("Please enter a number greater than 0.");
                    } else {

                        double[] numbers = new double[n];

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            numbers[i] = getDouble(input);
                        }

                        double maximum = numbers[0];

                        for (int i = 1; i < n; i++) {
                            if (numbers[i] > maximum) {
                                maximum = numbers[i];
                            }
                        }

                        System.out.println("Maximum: " + maximum);
                    }
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        input.close();
    }

    // Makes sure the input is a whole number
    public static int getInt(Scanner input) {

        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
        }

        return input.nextInt();
    }

    // Makes sure the input is a valid number
    public static double getDouble(Scanner input) {

        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
        }

        return input.nextDouble();
    }
}
