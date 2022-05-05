import java.io.*;

public class Rec {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("m4n_q1u_666", "666", "180");
        FileOutputStream fos = new FileOutputStream("2022/5/3/object1");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();
        FileInputStream fis = new FileInputStream("2022/5/3/object1");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User user1 = (User) ois.readObject();
        System.out.println(user1.name);
        ois.close();
    }
}

class User implements Serializable {
    public String age;
    public String height;
    public String name;

    public User(String name2, String age2, String height2) {
        this.name = name2;
        this.age = age2;
        this.height = height2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age2) {
        this.age = age2;
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height2) {
        this.height = height2;
    }
}
