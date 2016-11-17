import java.util.Scanner;

/**
 * Created by admin on 17.11.2016.
 */
public class C57 {
    public static void printLogaritm(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is;" + result);
        //5.6 return statement
    }

    public static void scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }
        double x = in.nextDouble();
        printLogaritm(x);
        //5.7 validating input
    }

    public static void countdown(int n) {
        if (n == 0) ;
        {
            System.out.println("Blastoff");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }

    }
}


