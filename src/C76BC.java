import java.util.Scanner;
/**
 * Created by admin on 18.12.2016.
 */
public class C76BC { public static void scanDouble() {
    Scanner in = new Scanner(System.in);
    boolean okey;
    do {
        System.out.print("Enter a number: ");
        if (in.hasNextDouble()) {
            okey = true;
        } else {
            okey = false;
            String word = in.next();
            System.err.print(word + " is not a number");
        }
    } while (! okey);
    double x =in.nextDouble();

}
    public static void main(String[] args) {
        scanDouble();
    }
}


