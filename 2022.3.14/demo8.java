public class demo8 {
    public static void fun1() {
        fun2();
    }

    public static void fun2() {
        fun3();
    }

    public static void fun3() {
        try {
            fun4();
        } catch (Exception e) {
            throw new RuntimeException("fun3", e);
        }
    }

    public static void fun4() {
        throw new RuntimeException("fun4");
    }

    public static void main(String[] args) {
        fun1();
    }
}