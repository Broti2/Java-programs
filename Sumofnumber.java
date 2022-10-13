import java.util.Scanner;

// Sum of natural number
public class Sumofnumber {
    public static void main(String[] args) {
        int i,sum=0,j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        j=scan.nextInt();
        for (i = 1; i <= j; i++) {
           sum=sum+i;
        }
        System.out.print(sum
}
