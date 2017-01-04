package chapter01;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		while(true){//무한루프를 활용해서 사용 무한루프와 break
		

			System.out.println("숫자입력 ");
			int value = scanner.nextInt();
			
			if(value ==0){
				break;
			}
			
			sum+=value;

		System.out.println(sum);
		scanner.close();
		}
	}

}
