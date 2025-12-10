import java.util.Scanner;

public class FahrenhitToCelsis {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temp Converter");
        System.out.print("Enter your temp in F : ");
        float fah = input.nextFloat();
        float cel = (fah - 32) *  5.0f / 9.0f;
        System.out.println("Your temp is : " +cel + "C");

    }
}
