public class demo2 {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 33, 12);
        Student ps = new Student("小军", 12, 55);
        System.out.println(ps.getScore());
    }

}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetAge(int age) {
        this.age = age;
    }

}

class Student extends Person {
    protected int core;

    public Student(String name, int age, int core) {
        super(name, age);
        this.core = core;
    }

    public int getScore() {
        return core;
    }
}
