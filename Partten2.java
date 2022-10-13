import java.util.Scanner;

public class Partten2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int k = 1; k < n; k++) {
            for (int j = 0; j < k; j++) {              
                System.out.print(" ");
            }
            for(int i=0;i<n-k;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int q=0;q<n;q++){
            for(int j=1;j<n-q;j++)
            {
                System.out.print(" ");
            }
            for(int v=0;v<=q;v++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }