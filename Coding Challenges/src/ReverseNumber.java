import java.util.Scanner;

public class ReverseNumber
{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverese the digits : ");
        System.out.println("Please enter your number : ");
        int num = input.nextInt();
        System.out.println("Reverse of your number is " + reverse());
    }

    public static int reverse (int num) {
        return num;
    }
}
