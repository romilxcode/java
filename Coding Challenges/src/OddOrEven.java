import java.util.Scanner;

public class OddOrEven {
    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to odd and even Calculator\n");
        System.out.print("Please enter your number : ");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println("Your number is an even number");
        } else {
            System.out.println("Your number is an odd number");
        }
    }
}
