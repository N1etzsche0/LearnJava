import java.io.*;

public class demo11 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage:\n  java CopyFile.java <source> <target>");
            System.exit(1);
        } else {
            File f1 = new File(args[0]);
            f1.setWritable(true, false);
            f1.setReadable(true);
            File f2 = new File(args[1]);
            f2.setWritable(true, false);
            f2.setReadable(true);
            copyFile(f1, f2);
        }

    }

    private static void copyFile(File source, File dest) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(dest))) {
            in.transferTo(out);
        }
    }

}
