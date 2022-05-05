@FunctionalInterface
interface Foo {
    double min(double i1, double i2);
}

public class demo7 {
    public static void main(String[] args) {
        Foo f = Math::min;
        System.out.println(f.min(5.0, 2.0)); // 2.0
        String Str = new String("225");
        System.out.println(Str.matches("(^2{0,6})(5$)"));
    }
}