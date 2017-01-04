package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("어디까지 더한거 알고 싶음? : ");
		int count = scanner.nextInt();
		
		int sum=0;
		
		for(int i=0; i<=count; i++){
		
			sum=sum+i;
		}
		
		System.out.println(count+"까지 더한 값은 "+sum+"입니다.");
		
		scanner.close();

	}

}
