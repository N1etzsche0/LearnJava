import java.util.Scanner;

public class Experiment {
	public static void main(String asgs[]) {
		Scanner a = new Scanner(System.in);// 输入
		String str = a.nextLine();// 定义输入类型
		String[] arrmy = str.split(",");// 一次性输入的以，分隔符
		int j = arrmy.length, i;
		for (i = 0; i < j - 1; i++) {
			System.out.println(arrmy[i]);
		}
	}
}