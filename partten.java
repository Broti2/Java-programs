import java.util.Scanner;

public class partten{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int k=0;k<n;k++){
        for(int j=0;j<n-k;j++)
        {
            System.out.print(" ");
        }
        for(int v=0;v<k;v++)
        {
            System.out.print("* ");
        }
        System.out.println();
        }
    for (int w = 0; w < n; w++) {

        for (int r = 0; r < w; r++) {              
            System.out.print(" ");
        }
        for(int i=0;i<n-w;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
