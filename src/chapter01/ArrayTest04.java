package chapter01;

public class ArrayTest04 {

	public static void main(String[] args) {
		Student s1 = new Student();//패키지 안에 Student 클래스가 존재해서 허용 가능 //
		
		Student[] students = new Student[3]; //student객체를 만든것이아니라, 배열 객체를 만든 것임
		
		for( Student s : students){
			System.out.println(s);
		}
		
		System.out.println("-----------------------");
		
		//흔히 하는 실수
		//students[0].name="둘리";//객체를 참조하고있지 않아서 애러 가뜸
		
		//위에 식이 에러가 뜨지 않게 하기 위해서는
		
		students[0] = new Student();
		students[0].name ="둘리";
		
		for( Student s : students){
			if(s!=null){
			System.out.println(s.name);
			}
		}

}
}
