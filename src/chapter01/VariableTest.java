package chapter01;

public class VariableTest {
	
	int number;
	
	public void test(){
		int j= number+10; //인스턴스변수는 초기화가 된다 
	}

	public static void main(String[] args) {
		
		int i;
		//int i = 20; // 애러 변수는 식별자 이다. (즉  같은 이름의 변수는 안됨)
		
		boolean isHooiday = false;
		
		char c ='A'; //문자를 그냥 넣은것 (리터널이라고 함)
		char c1 =65; //아스키 코드 값을 넣은 것
		
		byte b =10;
		short s= 20;
		int k=10;
		long l =10;
		float f =3.14f;
		int j=10;
		//int j = i;// 애러 지역변수는 반드시 초기화 되어야한다.
		
		System.out.println(c + ":" + c1);
		System.out.println(b);
		System.out.println(s);
		System.out.println(k);
		System.out.println(l);
		System.out.println(f);
		
		//상수의 표현(final)
		final int m = 20;
		//max_speed = 200;
		//final을 사용하면  final다음엔 변수 값을 바꾸지 못함(애러가 뜸)
		
		//string 객체확인
		String str = new String("Hello"); //string은 char의 집합체
		System.out.println(str);//str이 가르키는 객체의 리스트들이 줄줄이 나오는 것
		
		//String 객체를 리터럴로 사용하기
		String strl = "Hello";
		System.out.println(strl);

	}

}
