import java.util.Scanner;

//swap up any number using third variable
public class Swapup {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        System.out.println("Before swapup a= "+a+"b= "+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("After swapup a="+a+" b="+b);
    }
}