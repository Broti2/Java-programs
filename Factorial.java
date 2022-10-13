import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, j, k = 1;
        System.out.println("Enter any number:");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        for (j = 1; j <= i; j++) {
            k = k * j;
        }
        System.out.println("factorial of " + i + " is: " + k);
    }
}
