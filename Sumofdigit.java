import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        int i, r, sum = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        i= sc.nextInt();
        while (i > 0) {
            r = i % 10;
            sum = sum + r;
            i = i / 10;
        }
        System.out.print(sum);
    }
}
