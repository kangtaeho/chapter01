package chapter01;

import java.util.Scanner;

public class Continue02 {

	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("0~9까지 수를 입력하세요");
		
		for(int i=0; i<10; i++){
			
			if(i>5){
				continue;
			}
		}
	}
}
