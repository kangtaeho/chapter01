package chapter01;

public class SumToInput2 {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("java SumToInput2 [number]");
			return; // 종료하고싶을때
		}
		
		//문자열을 숫자로 바꾸는  방법
		int number =Integer.parseInt(args[0]); //integer는 임포트르 안해줘도 됨.. (자동임포트)
		
		//숫자를  문자열로바꾸는 방법
		int n =10;
		String s = "" +n; //문자에 숫자를 더하면 문자로 된다 그래서 string에 들어갈 수 있는 것
		String s1 = String.valueOf(n); // 이게 원래 숫자를 문자열로 바꾸는 방법이다


		int count = 0;		
		int sum = 0;
		for (int i = 0; i <= count; i++) {

			sum = sum + i;
		}
		System.out.println(sum);

	}
}
