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


        System.out.println("\nEmployee Name: " + name);
        System.out.println("Gross Pay: $" + String.format("%.2f", hours * pay));

    }
    
}