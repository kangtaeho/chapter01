package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		int n3 = 0;
		
		n3=n1;
		n1=n2;
		n2=n3;

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 3;
		int a2 = 2;
		int a3 = 1;

		if (a1 > a2) {
			if (a1 > a3) {
				System.out.println("최대값은  " + a1 + " 입니다.");
			} else {
				System.out.println("최대값은  " + a3 + " 입니다.");
			}
		} else {
			if (a2 > a3) {
				System.out.println("최대값은  " + a2 + " 입니다.");
			} else {
				System.out.println("최대값은  " + a3 + " 입니다.");
			}
		}
		
	}

}
