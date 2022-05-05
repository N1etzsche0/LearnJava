public class demo4 {
    public static void main(String[] args) {
        Outer outer = new Outer("Fuck");
        outer.sayHello();
    }
}

class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    void sayHello() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Outer.this.name + "You");
            }
        };
        new Thread(runnable).start();
    }
}