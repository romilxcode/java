public class Arguments {
    public static void main(String[] args) {
        int num1 = SumTwoNumbers(4,7);
        System.out.println(num1);
         int num2 = SumTwoNumbers(4,50);
        System.out.println(num2);
    }

    public static int SumTwoNumbers(int first,int second) {
        System.out.println("First number received : " + first);
        System.out.println("Second number received : " + second);
        int sum = first + second;
        System.out.print("Total Sum of two number is : ");
        return sum;
    }
}
