package chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] a = new int[4]; // 배열 객체 생성  (주소값을 해싱한 레퍼런스 값?)
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		//a[4]=10; //예외 발생(Array가 인덱스를 벗어남)
		
		int sum=0;
		int length= a.length;
		for(int i =0; i<length; i++){
			sum = sum + a[i];
		}
		
		System.out.println(sum);
		
		//확장 for문(for~each문)
		for(int value : a){
			System.out.println(value);
		}

	}

}
