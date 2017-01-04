package chapter01;

public class ForTest {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i = 1;i<10;i++){
			sum=sum+i;
			//i+=2;//짝수만 출현
		}
		
		System.out.println(sum);

	}

}
