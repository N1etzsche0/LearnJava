public class demo6 {
    public static void main(String[] args) {

        int x = 6, y = 6; // 行，列
        int a = 1, b;
        // 行操作
        for (int i = 1; i <= x; i++) {
            b = a; // 初始化每行开头数据
            // 列操作
            for (int j = i + 1; j <= y + 1; j++) {
                System.out.print(b);
                b += j;
            }
            System.out.println();
            a += i;
        }
    }
}
