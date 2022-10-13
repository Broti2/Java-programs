import java.io.*;

public class Palindrom {
    public static void main(String[] args) throws IOException {
        int num, sum = 0, m, i;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(read);
        System.out.println("Enter the number");
        num = Integer.parseInt(buf.readLine());
        for (i = num; i > 0; i /= 10) {
            m = i % 10;
            sum = sum + m;
        }
        System.out.println("Sum of all the digit of the number=" + sum);
        if (sum == num)
            System.out.println("It is palindrom");
        else
            System.out.println("It is not a palindrom");
    }
}