//ther is a error in this program
public class PrintPrime {
    public static void main(String[] args) {
        int i, j, k, count = 0;
        for (i = 1; i <= 100; i++) {
            for (j = 1; j <= i; j++) {
                k = i % j;
                if (k == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(i);
            else
                count = 0;
        }
    }
}