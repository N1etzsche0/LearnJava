import java.io.Console;
import java.util.Scanner;

class User {
    private String name, password;
    private static int number;

    public User() {
        number++;
    }

    public User(String name) {
        number++;
        this.name = name;
    }

    public User(String name, String password) {
        number++;
        this.name = name;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "名字：" + name + "  密码：" + password + "  用户数" + number;
    }
}

public class UserTest {
    public static void main(String args[]) {
        User u = new User("老王", "123456");
        try {
            Console cnsl = System.console();
            char[] pwd = cnsl.readPassword("Password: ");    // 获取用户输入的原密码
            if (String.valueOf(pwd).equals(u.getPassword())) {
                // 对用户输入的密码进行验证
                char[] pwd1 = cnsl.readPassword("New Password: ");
                char[] pwd2 = cnsl.readPassword("Again Password: ");
                while (!String.valueOf(pwd1).equals(String.valueOf(pwd2))) {
                    System.out.println("密码不一致");
                    pwd1 = cnsl.readPassword("New Password: ");
                    pwd2 = cnsl.readPassword("Again Password: ");
                }
                u.setPassword(String.valueOf(pwd2));    // 获取用户输入的新密码
            } else {
                System.out.println("输入的密码错误，无法进行修改！");
            }
            System.out.println("----------------用户信息----------------\n" + u);
        } catch(Exception e){
            System.out.println(e); // 打印异常信息
        }
    }
}
