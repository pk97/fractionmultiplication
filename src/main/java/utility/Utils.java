package utility;

 public class Utils {
    public static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        a = Math.abs(a);
        b = Math.abs(b);

        if (a > b)
            return gcd(a%b,b);
        else
            return gcd(a, b%a);
    }
}
