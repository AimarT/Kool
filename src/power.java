/**
 * Created by admin on 23.12.2016.
 */
public class power {
    public static double power(double x, int n) {
        if (n < 0) {
            return 1;
        } else if  (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(3,3));
    }

}

