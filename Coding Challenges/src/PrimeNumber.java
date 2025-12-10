// Java program to demonstrate Optimized method based to check if a number is prime
import java.util.Scanner;

class PrimeNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker : ");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Congrats your num is prime...");
        } else {
            System.out.println("Sorry your num is not prime sorry....");
        }

    }

    public static boolean isPrime(int num) {

        int i = 2;
        while (i < num) {
            if(num % i ==0) {
                return false;
            }
            i++;
        }
            return true;
        }
    }
