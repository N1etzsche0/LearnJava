public class demo6 {
    public static void main(String[] args) {
        Person SB = new Person();
        SB.setName("2B");
        SB.setAge(13);
        System.out.println(SB.getName());
        System.out.println(SB.getAge());
        System.out.println(SB.isChild());
    }

}

class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isChild() {
        return age <= 6;
    }
}