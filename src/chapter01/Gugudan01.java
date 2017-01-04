package chapter01;

import java.util.Scanner;

public class Gugudan01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("몇단을 알고 싶습니까 : ");
		int count = scanner.nextInt();
		
		int i=1;
		int j=1;
		
		switch(count){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:{
			while(i<10){
			int end = count*i;
			System.out.println(count+" x "+i+"="+end);
			i++;
			
		}
		break;
		}default :{
			for(i=2;i<10;i++){
				for(j=1;j<10;j++){
					int a = i*j;
					System.out.println(i+" * "+j+" = "+ a);
				}
			}
		}
			
		}


	}

}
