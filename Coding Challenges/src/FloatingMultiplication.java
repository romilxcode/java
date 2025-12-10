import java.util.Scanner;

public class FloatingMultiplication {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Floating Multiplication\n");
        System.out.print("Please enter your first number: ");
        double first = input.nextDouble();
        System.out.print("Now, Please enter your second number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\n Result is: " + mul);

    }
}
