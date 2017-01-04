package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		while (true) {
			sum += num;
			if (sum > 5000) {
				break;// 브레이크를 하면 if만 벗어나는 것이아니라 while 의 무한 반복 문을 벗어 난다.
			}
			num++;
		}
		System.out.println(sum);
	}

}
