import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, r, sum = 0, t;
        System.out.print("Eneter any number\n");
        Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
        t = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (t == sum || t < 10)
            System.out.println("Yes the entered number is palindrome " + sum);
        else
            System.out.print("The entered number is not palindrome " + sum);
    }
}
