/**
 * Created by admin on 23.12.2016.
 */
public class myexp {
    //ex = 1 + x + x2=2! + x3=3! + x4=4! + : : ://
    public static double myExp (int x, int n) {
        double exp = 1 + x;
        for (int i = 2; i <= n; i++){
            exp *= x;
        }
        return exp;
    }
    public static double myExp2 (int x, int n) {
        double exp = 1 + x;
        for (int i = 2; i <= n; i++) {
            exp += (x * x) / (i / i);
        }
        return exp;
    }

    public static void main(String[] args) {
        System.out.println(myExp(2,2));
        System.out.println(myExp2(2,2));
    }
}
