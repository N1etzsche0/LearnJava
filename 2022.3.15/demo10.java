// import java.io.*;

// public class demo10 {
// public static void main(String[] args) throws IOException {
// byte[] bytes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// try (InputStream input = new FileInputStream("/home/joker/test.txt")) {
// String s = readAsString(input);
// System.out.println(s);
// }
// }

// public static String readAsString(InputStream input) throws IOException {
// int n;
// StringBuilder sb = new StringBuilder();
// while ((n = input.read()) != -1) {
// sb.append((char) n);
// }
// return sb.toString();
// }
// }
