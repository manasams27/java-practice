public class DynamicPatterns {
    public static void main(String[] args) {

        for (int r = 1; r <=3; r++) {
            for (int c = 1; c <= 9; c++) {

                if ((r + c == 4) ||
                    (c - r == 2) ||
                    (r + c == 8) ||
                    (c - r == 6)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}