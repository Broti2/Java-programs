import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int i, count = 0, j,k;
        System.out.println("Enter any number to check weather its prime or not");
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        for(k=1;k<=j;k++)
        {
        for (i = 1; i <= k; i++) {
            if (k % i == 0)
                count++;
        }
        if (count != 2)
            System.out.println(k + "notprime");
        else
            System.out.println(k + "not prime");
            count=0;
    }
    }
}