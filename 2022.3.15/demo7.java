import java.util.*;
import java.lang.*;

public class demo7 {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }

    }

    static String toHex(int n) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Stack<String> stack = new Stack<String>();
        map.put(10, "A");
        map.put(11, "B");
        map.put(12, "C");
        map.put(13, "D");
        map.put(14, "E");
        map.put(15, "F");

        do {
            int m = n % 16;
            String v = m > 9 ? map.get(m) : String.valueOf(m);
            stack.push(v);
            n = n / 16;
        } while (n != 0);

        StringBuffer hex = new StringBuffer();
        while (stack.size() != 0) {
            hex.append(stack.pop());
        }
        return hex.toString();
    }
}