import java.util.Scanner;

public class Perimeter {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator");
        System.out.print("Please enter all 4 sides in cms : ");
        double a = input.nextDouble();
        System.out.print(" Please enter your north side : ");
        double b = input.nextDouble();
        System.out.print("Please enter your south side : ");
        double c = input.nextDouble();
        System.out.print("Your enter your east side : ");
        double d = input.nextDouble();

        double perimeter = a + b + c + d;

        System.out.println("Perimeter of your rectangle is : " + perimeter);
    }
}
