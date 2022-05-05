import java.io.*;

public class demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (// 创建一个ObjectOutputStream输出流
                ObjectInputStream oos = new ObjectInputStream(new FileInputStream("object.txt"))) {
            // 将对象序列化到文件s
            Person person = (Person) oos.readObject();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String obj = "hello world!";
        // 创建一个包含对象进行反序列化信息的”object”数据文件
        FileOutputStream fos = new FileOutputStream("2022/5/3/object");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        // writeObject()方法将obj对象写入object文件
        os.writeObject(obj);
        os.close();
        // 从文件中反序列化obj对象
        FileInputStream fis = new FileInputStream("2022/5/3/object");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // 恢复对象
        String obj2 = (String) ois.readObject();
        System.out.print(obj2);
        ois.close();
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    // 我不提供无参构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}