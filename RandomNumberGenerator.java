import java.util.Random;

public class RandomNumberGenerator {
    public static int generate(final int high) {
        final int low = 0;
        final Random r = new Random();
        return r.nextInt(high-low) + low;
    }
}
