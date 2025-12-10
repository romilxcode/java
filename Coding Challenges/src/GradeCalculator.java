import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grade Calculator\n");
        System.out.println("Please enter your marks to calculate the grade : ");
        int marks = input.nextInt();

        if(marks > 90) {
            System.out.println("Your Grade is A");
        } 
        else if(marks > 85) {
            System.out.println("Your Grade is B");
        } 
        else if(marks > 70) {
            System.out.println("Your Grade is C+");
        } 
        else if(marks > 60) {
            System.out.println("Your Grade is D");
        } 
        else if(marks > 30) {
            System.out.println("Your Grade is F");
        } 
        else {
            System.out.println("You have failed the exam. Better luck next time!");
        }
    }
}
