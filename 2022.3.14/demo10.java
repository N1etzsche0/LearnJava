import java.util.*;

public class demo10 {
    public static void main(String[] args) {
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        List<Integer> arry = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            arry.add(i);
        }
        for (int i = 0; i < arry.size(); i++) {
            for (Integer j : list) {
                if (arry.get(i) == j) {
                    arry.remove(i);
                }
            }
        }
        return arry.get(0);
    }
}
