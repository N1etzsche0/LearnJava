import java.util.*;
import java.util.function.LongSupplier;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class demo4 {
    public static void main(String[] args) {
        LongStream Fib = LongStream.generate(new FibSupplier());
        Fib.limit(10).forEach(System.out::println);
    }

    public static class FibSupplier implements LongSupplier {
        private long a = 0;
        private long b = 1;

        @Override
        public long getAsLong() {
            long c = a;
            a = b;
            b += c;
            return a;
        }

    }
}
