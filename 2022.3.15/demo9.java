// import java.io.*;

// public class demo9 {
// public static void main(String[] args) throws Exception {
// File f = new File("/home/joker");
// File[] fs1 = f.listFiles();
// printFiles(fs1);
// File[] fs2 = f.listFiles(new FilenameFilter() {
// public boolean accept(File dir, String name) {
// return name.endsWith(".txt");
// }
// });
// printFiles(fs2);
// }

// static void printFiles(File[] files) {
// System.out.println("================================================================");
// if (files != null && files.length > 0) {
// for (File f : files) {
// System.out.println(f);
// }
// }
// System.out.println("================================================================");
// }
// }
