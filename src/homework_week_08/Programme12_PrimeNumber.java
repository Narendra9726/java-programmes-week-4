package homework_week_08;

import java.util.Scanner;

/**
 * Write a programme in java with scanner to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */

public class Programme12_PrimeNumber {
    public static void main(String[] args) {
        // Creating scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // if else
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        // Closing scanner

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
