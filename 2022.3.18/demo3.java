import java.io.StringWriter;

import java.io.*;

public class demo3 {
    public static void main(String[] args) {
        StringWriter buffer = new StringWriter();
        try (
                PrintWriter writer = new PrintWriter(buffer)) {
            writer.println("Hello");
            writer.println("fuck you world!");
            writer.println("true");
        }

        System.out.println("1");
        System.out.println("fuck you world!");
        System.out.println("true");
    }
}
