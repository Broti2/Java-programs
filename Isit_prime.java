import java.util.Scanner;

public class Isit_prime {
    public static void main(String[] args) {
        int i, j, k, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        i = sc.nextInt();
        if (i == 0 || i == 1)
            System.out.println("neither prime nor composite");
        else
            for (j = 1; j <= i; j++) {
                k = i % j;
                if (k == 0) {
                    count++;
                }
            }
        if (count == 2) {
            System.out.println("prime");
        } else if (count > 2)
            System.out.println("not prime");
    }
}
