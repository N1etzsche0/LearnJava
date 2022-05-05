import java.lang.reflect.Field;

public class demo9 {
    public static void main(String[] args) throws Exception {
        Object p = new Person("Xiao Ming");
        Class c = p.getClass();
        System.out.println(c);
        Field f = c.getDeclaredField("name");
        System.out.println(f);
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value); // "Xiao Ming"
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
