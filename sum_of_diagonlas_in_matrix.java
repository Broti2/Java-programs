import java.util.Scanner;

public class sum_of_diagonlas_in_matrix {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i, j, sum1 = 0, sum2 = 0;
        int arr[][] = new int[3][3];
        System.out.println("Enter the value of martix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println();
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                    
            }
            sum1 = sum1 + arr[i][j];
        }
        System.out.println("sum of r1,r2,r3 is " + sum1);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i + j == 2)
                    sum2 = sum2 + arr[i][j];
            }
        }
        System.out.println("sum of left diagonal is " + sum2);
    }

}