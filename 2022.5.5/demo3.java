import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, (s1, s2) -> s1.compareTo(s2));
        System.out.println(String.join(", ", array));
    }
}
