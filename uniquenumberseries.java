public class uniquenumberseries {
    public static void main(String arg[]) {
        int a, b, c;
        for (a = 1; a <= 3; a++) {
            for (b = 1; b <= 3; b++) {
                for (c = 1; c <= 3; c++)
                    if (a != b && b != c && a != c)
                        System.out.println(a + "" + b + "" + c);
            }
        }
    }
}