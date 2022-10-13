import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        int j,i;
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        i= scan.nextInt();
        for (j = 1; j <= i; j++) {
            if (j % 2 == 0)
                System.out.println(j + "even");
            else
               System.out.println(j + "odd");
        }
    }
}