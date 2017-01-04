package chapter01;

public class ContinueTest {

	public static void main(String[] args) {
		
		for(int i =0; i <=20; i++){
			
			if((i & 2) != 0){
				System.out.println(i);
			}
			else if((i & 3) == 0){
				 continue;
			}
			else if((i & 4) == 0){
				continue;
			}
		}
	}

}
