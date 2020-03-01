// GCD - Greatest Common Divisor. Largest number which divides both.
// Implementation of Euclid's algorithm
// HINT: gcd(p, q) == gcd(p - q, q) for p > q
public class Gcd {
    private static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        System.out.println(gcd(16, 8));
    }
}
