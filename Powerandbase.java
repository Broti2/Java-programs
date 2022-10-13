import java.util.Scanner;

public class Powerandbase {
    public static void main(String[] args) {
        int power,base=2;
        System.out.println("Enter the value of base number:");
        Scanner sc=new Scanner(System.in);
        base=sc.nextInt();
        System.out.println("Enter the value of power");
        power = sc.nextInt();
        System.out.print(Math.pow(base, power));
    }
}