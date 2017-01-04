package chapter01;

import java.util.Scanner;

public class Iotest {

	public static void main(String[] args) {
		System.out.println("Helllo World");
		System.out.print("Hello World");
		System.out.println("Helllo World");
		
		System.out.print("Hello World\n");//개행문자를 사용하여 띄어 쓰기를 함
		System.out.println("Helllo World");
		
		System.out.println("");//ln때문에 자동적으로 띄어쓰기
		System.out.print("\n");//이건 \n때문에 
		System.out.println("Helllo World");
		
		Scanner scanner =new Scanner(System.in);//그냥 이대로 하면 애러가 뜨기 때문에 임포트를 해주어야함 (ctrl +shift +o)
		
		int count1 = scanner.nextInt();
		int count2 = scanner.nextInt();
		
		String str = scanner.next();
		
		System.out.println(count1+" : "+count2+" : "+str);
		
		
		String str2 = scanner.next(); //이대로 출력하면 띄어쓰기(스페이스)한 부분이 출력이 안됨
		System.out.println(str2);
		
		String str3 = scanner.nextLine();//넥스트 라인을 사용해야지 띄어쓰기 다음부분도 출력됨
		
		System.out.println(str3);
		//키보드 자원정리
		scanner.close();

	}

}
