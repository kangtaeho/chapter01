package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		while (true) {
			System.out.print("Hello World 몇개 출력 ? : ");
			int count = scanner.nextInt();

			if (count <= 0) {
				System.out.println("잘못 입력하셧습니다 다시 입력하세요");
				continue;
			} else {

				for (int i = 0; i < count; i++) {
					System.out.println("Hello World");
				}

			}
			break;
		}
		scanner.close();
	}

}
