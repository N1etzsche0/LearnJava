import java.util.*;

public class demo11 {
    public static void main(String[] args) {
        List<Persona> list = List.of(
                new Persona("Xiao", "Ming", 18),
                new Persona("Xiao", "Hong", 25),
                new Persona("Bob", "Smith", 20));
        boolean exist = list.contains(new Persona("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}

class Persona {
    String firstName;
    String lastName;
    int age;

    public Persona(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof Persona) {
            Persona p = (Persona) o;
            return Objects.equals(this.firstName, p.firstName) &&  && Objects.equals(this.lastName, p.lastName) && age == p.age ;
        }
        return false;
    }

}
