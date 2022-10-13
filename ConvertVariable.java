
//WAP input variable and print them in the form of integer, float and double form using string in java.
import java.util.Scanner;

public class ConvertVariable {
    public static void main(String[] args) {
        String A;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        A = sc.next();
        System.out.println("integer value= " + Integer.parseInt(A));
        System.out.println("float value=" + Float.parseFloat(A));
        System.out.println("double value=" + Double.parseDouble(A));
    }
}