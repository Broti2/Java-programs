
//Multiplication of any number.
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int k;
        System.out.println("Enter any number");
        Scanner input = new Scanner(System.in);
        int j = input.nextInt();
        System.out.println("Multiplication table of " + j + " is given below");
        for (int i = 1; i <= 10; i++) {
            k = j * i;
            System.out.println(j + " x " + i + " = " + k);
        }
    }
}