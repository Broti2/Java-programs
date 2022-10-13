public class binary {
    public static void main(String[] args) {
        int rows = 5, number = 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                if (number % 2 == 0)
                    number++;
                else
                    number = number - 2;
            }

            System.out.println();
        }
    }
}