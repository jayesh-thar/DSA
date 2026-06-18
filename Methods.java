public class Methods {

    // public static void Name() {
    //     System.out.println("My name is Jayesh");
    // }

    // public static int Sum(int i, int j) {
    //     return i+j;
    // }

    public static int fact(int n) {
        int facts = 1;
        for(int i = 1; i<=n; i++){
            facts*=i;
        }
        return facts;
    }


    public static void main(String[] args) {

        //Method: pre-defined function - ready to use
        // EX.: Math.XYZ()
        // System.out.println(Math.PI);
        // System.out.println(Math.max(15, 50));
        // System.out.println(Math.min(10, 10));
        // System.out.println(Math.ceil(15.5)); // upper values
        // System.out.println(Math.floor(15.5)); // lower values
        // System.out.println(Math.abs(18.5));
        // System.out.println(Math.abs(-15)); // mod - |x|
        // System.out.println(Math.pow(2, 5));
        // System.out.println(Math.pow(5, 5));
        // System.out.println(Math.sqrt(100));
        // System.out.println(Math.sqrt(25));
        // System.out.println(Math.cbrt(1000));
        // System.out.println(Math.cbrt(27));
        // System.out.println(Math.round(15.2));
        // System.out.println(Math.round(15.5));
        // System.out.println(Math.round(15.500001));
        // System.out.println(Math.round(15.8));
        // System.out.println(Math.random());

        // Name();

        // System.out.println("Sum is: " + Sum(4, 5));

        int n = 9;
        int r = 3;
        int pers = fact(n) / fact(n-r);
        int cobs = fact(n) / (fact(r)*fact(n-r));
        System.out.println("Permutation: " + pers);
        System.out.println("Combination: " + cobs);


    }   
}