package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        // Instantiate scanner
        Scanner scanner = new Scanner(System.in);

        // getting user info
        System.out.print("Enter your name:\n>>> "); String name = scanner.nextLine();
        System.out.print("Enter your hours worked:\n>>> "); float hours = scanner.nextFloat();
        System.out.print("Enter your pay:\n>>> "); float pay = scanner.nextFloat();

        double grossPay = (hours > 40) ? (40 * pay) + ((hours - 40) * (pay * 1.5)) : (hours * pay);
        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Gross Pay: $%.2f", grossPay);

    }

}