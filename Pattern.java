
public class Pattern {
    public static void main(String[] args) {

        // nestedLoop: loop inside loop...
        for (int i = 1; i <= 4; i++) { // ROW's - how many line
            for (int j = 1; j <= 5; j++) { // COLUMN's - how many star to print in that one row's
                System.out.print(" * ");
            }
            System.out.println(); // next line
        }

        System.out.println();

        for (int i = 1; i <= 4; i++) { // ROW's - how many line
            for (int j = 1; j <= 5; j++) { // COLUMN's - how many star to print in that one row's
                System.out.print(j + " ");
            }
            System.out.println(); // next line
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        int n = 5;
        for (int i = 1; i <= n; i++) {
            int nums = 65;
            for (int j = 1; j <= n; j++) {
                System.out.print((char) nums + " ");
                nums++;

            }
            System.out.println();
        }

        System.out.println();

        // optimized:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 64) + " "); // replace 96 for 'a' - 97
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " "); // replace 96 for 'a' - 97
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 64) + " ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 96) + " ");
                }
                System.out.println();
            }
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        System.out.println();

        // exceptional case:
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n + 1 - i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        // NOTE: same we do by if() to skip one line alternative....

        System.out.println();

        int a = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("@ ");
            }
            a--;
            System.out.println();
        }

        System.out.println();

        // Hollow square/rectangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // plus star
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == ((n / 2) + 1) || j == ((n / 2) + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // cross star
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == n + 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Floyd's triangle
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print(count + " ");
                // count++;
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

        System.out.println();

        // binary alternative triangle
        int bin = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (bin == 1) {
                    System.out.print(bin);
                    bin = 0;
                } else {
                    System.out.print(bin);
                    bin = 1;
                }
            }
            System.out.println();
        }

        System.out.println();

        // binary triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println();

        
    }
}
