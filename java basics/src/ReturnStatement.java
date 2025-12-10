import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        System.out.println("Welcome to Return Statement Program....\n");
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.print("Sum of the two number is : " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to Return Statement Program\n");
    }
}