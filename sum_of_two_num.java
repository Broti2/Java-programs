
//sum of two number
import java.util.Scanner;

public class sum_of_two_num {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0;
        int sum;
        System.out.println("Enter First number");
        first = input.nextInt();
        System.out.println("Enter Second number");
        second = input.nextInt();
        sum = first + second;
        System.out.println("Sum of first and second number is:" + sum);
    }
}
