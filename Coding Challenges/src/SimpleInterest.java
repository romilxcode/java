import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator\n");
        System.out.print("Please enter your principle amount RS : ");
        int principle = input.nextInt();
        System.out.print("Now, tell me rate of your interest? ");
        float rate = input.nextFloat();
        System.out.println("Now, tell me for how many years are you borrowing this money? ");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("\n Your Simple interest is RS:" + interest);
    }
}
