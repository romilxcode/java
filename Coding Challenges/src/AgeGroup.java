import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Age Group Identifier\n");
        System.out.println("Please enter your age to identify the age group : ");
        int age = input.nextInt();
        if(age >= 0 && age <= 12) {
            System.out.println("You are a Child.");
        } 
        else if(age >= 13 && age <= 19) {
            System.out.println("You are a Teenager.");
        } 
        else if(age >= 20 && age <= 59) {
            System.out.println("You are an Adult.");
        } 
        else if(age >= 60) {
            System.out.println("You are a Senior Citizen.");
        } 
        else {
            System.out.println("Invalid age entered. Please enter a valid age.");
        }
    }
    
}
