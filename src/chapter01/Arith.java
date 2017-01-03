package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		
		a=a+1;
		System.out.println( a );
		
		a+=1;
		System.out.println( a );
		
		a++;
		System.out.println( a );
		
		++a;
		System.out.println( a );
		
		a--;
		System.out.println( a );
		
		--a;
		System.out.println( a );
		
		System.out.println(a++);//먼저 a의 값을 출력을 한 후, 그 다음에 +1 증가 하는 것
		System.out.println(++a);//이건 a에 +1이 더해진 후 출력이 됨
		
		System.out.println(10/3);// 결과가 그냥 3이나옴 (int 형으로)
		System.out.println(10./3.); // 사칙연산의 결과가 double
		
		System.out.println((double)10/3);
		//괄호 주의! 
		
		//나머지 연산
		System.out.println( 44 % 3 );
		
		System.out.println( -7 % 3 );
		System.out.println( 7 % -3 );
	}

}
