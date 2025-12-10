import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator\n");
        System.out.println("Please enter the year you want to calculate?");
        int year = input.nextInt();

        if(year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Your year is leap year");
        } 
         else {
            System.out.println("Your year is not leap year sorry!!!");
        }
    }   
}
