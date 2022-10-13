// Java Program to Print the Pyramid pattern

// Main class
public class pre_mid16 {

    // Main driver method
    public static void main(String[] args) {
        int rows = 4, number = 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
            }

            System.out.println();
        }
    }
}