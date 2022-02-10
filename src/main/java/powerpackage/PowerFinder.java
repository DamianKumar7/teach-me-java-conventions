package powerpackage;

public class PowerFinder {
    public static int calculatePower(int p, int q) {
        for (int i = 1; i<q; i++) {
            p *= p;
        }
        return p;
    }
}
