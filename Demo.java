// import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // print output:
        // System.out.println("Hello world");
        // System.out.print("Hello1");
        // System.out.print("Hello2");
        // System.out.print("Hello3\n");
        // System.out.print("Hello4\n");
        // System.out.print("Hello5");
        // System.out.print("Hello6");
        // System.out.print("Hello7\n");
        // System.out.print("Hello8");

        // // operation: + - * / %
        // System.out.println(5 + 5);
        // System.out.println(5 - 2);
        // System.out.println(5 - 6);
        // System.out.println(5 * 2);
        // System.out.println(4 / 2);
        // System.out.println(5 / 2);
        // System.out.println(10 % 2);
        // System.out.println(10 % 3);

        // // input - 'Scanner' class
        // Scanner sc = new Scanner(System.in);
        // int sum = sc.nextInt();
        // System.out.println(sum + sum);

        // // AREA:
        // double r = sc.nextInt();
        // System.out.println(3.14 * r * r);

        // // character: 'char'
        // char name = 'a';
        // System.out.println(name);

        // // char you = 'Uu'; //ERROR
        // // System.out.println(you);

        // /*
        // * NOTE: ASCII Value's
        // *
        // * a - 97 A - 65 0 - 48
        // * b - 98 B - 66 1 - 49
        // * c - 99 C - 67 2 - 50
        // * ... ... ...
        // * ... ... ...
        // * ... ... ...
        // * z - 122 Z - 90 9 - 57
        // *
        // *
        // * TIPS: "a = A + 32"
        // * a - 97 => A? => 97 - 32 => A - 65
        // * lly b - 98 => B: 98-32 => B - 66
        // *
        // */

        // // typecasting: 2 type:
        // // char -> int
        // // implicit:
        // char name = 'A';
        // int name01 = name;
        // System.out.println(name01); // A - ASCII value
        // // explicit:
        // int n = (int) 'A';
        // System.out.println(n);

        // System.out.println(name01 + n);
        // System.out.println(name01 * n);

        // // int->char
        // int jay = 65;
        // // char jayesh = jay; // implicit not in JAVA -> ERROR
        // char jayesh = (char) jay;
        // System.out.println(jayesh);

        // int numm = 10;
        // System.out.println(numm);
        // numm = numm + 1;
        // System.out.println(numm);
        // numm = numm + 5;
        // System.out.println(numm);
        // numm = numm - 1;
        // System.out.println(numm);
        // numm++;
        // System.out.println(numm);
        // // System.out.println(numm++); //use and then increment
        // System.out.println(++numm); // increment and the use

        // int number = 10;
        // System.out.println(number);
        // System.out.println(number++);
        // System.out.println(number);

        // // IMP:
        // int num001 = 10;
        // int num002 = num001++; // store num001 to num002 and then increment num001
        // System.out.println("x: " + num001 + " || " + "y: " + num002);

        // // boolean: false/true
        // System.out.println(9 > 8);
        // System.out.println(9 < 8);
        // System.out.println(8 <= 8);
        // System.out.println(9 == 8);
        // System.out.println(8 == 8);
        // System.out.println(8 == 7);

        // boolean istrue = 4 > 3;
        // System.out.println(istrue);

        // LOOP: if-else

        // if (Condition) {
        // do this if condition true
        // } else {
        // otherwise do this
        // }

        // even-odd
        int numbers = 10;
        if (numbers % 2 == 0) {
            System.out.println(numbers + " is even");
        } else {
            System.out.println(numbers + " is odd");
        }

        // same meaning as before code: '{} -> ignore if one line only'
        if (numbers % 2 == 0)
            System.out.println(numbers + " is even");
        else
            System.out.println(numbers + " is odd");

        // +ve/-ve
        int xy = -50;
        if (xy < 0)
            System.out.println(xy + " is -ve");
        else
            System.out.println(xy + " is +ve");

        // want only +ve even input value if -ve
        if (xy < 0)
            xy = -xy;
        System.out.println(xy);

        // isInteger?
        double val = 10.00001;
        int valInt = (int) val;
        if ((val - valInt) > 0)
            System.out.println("not integer...");
        else
            System.out.println("integer...");

        // 4-digit?
        int isFour = 5585;
        if (isFour > 999 && isFour < 10000)
            System.out.println("4 Digit...");
        else
            System.out.println("not 4 digit...");

        // triangle?
        int a = 39;
        int b = 20;
        int c = 20;
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Triangle...");
        else
            System.out.println("Not Triangle...");

        // Ternary operator: 'condition ? true : false'
        // note: return true or false value or string...

        // (values%2==0) ? sout("even") : sout("odd"); ===> not work in JAVA, work in c
        // and js
        int values = 15;
        System.out.println((values % 2 == 0) ? "even" : "odd");

        int nn = -10;
        String isPositive = (nn >= 0) ? "yes" : "no";
        System.out.println("positive: " + isPositive);

        // loops:

        // for(int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // even:
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + "  ");
        }
        System.out.println();
        // odd:
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + "  ");
        }
        System.out.println();
        // 17 table:
        for (int i = 17; i <= 170; i++) {
            if (i % 17 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        // OPTIMIZED:
        for (int i = 17; i <= 170; i = i + 17) {
            System.out.print(i + " ");
        }
        System.out.println();

        // AP:
        // aₙ = a + (n − 1)d

        int n = 10;
        // ap: 2, 5, 8, 11, 14, 17, .....
        // here: starting(a) = 2, difference(d): 3
        // 2 + (n - 1)3 => 2+3n-3 => 3n-1
        for (int i = 2; i <= 3 * n - 1; i = i + 3) {
            System.out.print(i + " ");
        }

        System.out.println();

        // optimized:
        int A = 2, d = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(A + " ");
            A = A + d;
        }

        System.out.println();

        // CHar - asciiValue
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i + " " + i);
        }
        // GP;
        // an = a.rⁿ⁻¹

        int aa = 10;
        int r = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(aa + " ");
            aa *= r;
        }
        System.out.println();

        // factor:
        int fac = 50;
        for (int i = 1; i <= fac; i++) {
            if (fac % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Optimized - squareRoot");
        for (int i = 1; i <= Math.sqrt(fac); i++) {
            if (fac % i == 0) {
                System.out.println(i + " - " + (fac / i)); // paired-wise
            }
        }

        // PRIME NO.:
        int primeValue = 191;
        boolean isPrime = true;
        // for(int i = 2; i<=primeValue-1; i++) {
        for (int i = 2; i <= Math.sqrt(primeValue); i++) { // OPTIMIZED
            if (primeValue % i == 0) {
                isPrime = false;
            }
        }
        if (primeValue == 1 || primeValue == 0) {
            System.out.println("Not prime, nor non-prime");
        } else if (isPrime == false) {
            System.out.println(primeValue + " is not prime...");
        } else {
            System.out.println(primeValue + " is prime...");
        }

        // BETTER VERSION OF FINDING PRIME or not?
        int primeValues = 191;
        if (primeValues <= 1) {
            System.out.println("Not prime, nor non-prime");
        } else {
            boolean isPrimes = true;

            for (int i = 2; i <= Math.sqrt(primeValues); i++) {
                if (primeValues % i == 0) {
                    isPrimes = false;
                    break;
                }
            }

            if (isPrimes) {
                System.out.println(primeValues + " is prime...");
            } else {
                System.out.println(primeValues + " is not prime...");
            }
        }

    }
}