package chapter01;

public class TypeTest {

	public static void main(String[] args) {
		
		//암시적(implicity) casting
		int i1 = 9999;
		long l1 = i1;
		
		// 명시적(explicity) casting
		long i2 =123456789;
		int l2 =(int)i2; //long값이 끊어지는 걸 알기때문에 앞에 (int)사용해서 애러를 없애준다
		
		System.out.println(l1 + ":" + i1);
		System.out.println(12 + ":" + i2);
		
		

	}

}
