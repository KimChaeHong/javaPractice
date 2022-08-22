package ch06;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(); //디폴트 생성자
		//디폴트 생성자(default controller)가 제공되는 경우는 
		//클래스에 생성자가 하나도 없는 경우에만 컴파일러가 생성자 코드를 넣어 줌
		//만약 쓰고싶다면 해당 클래스에 디폴트 생성자를 직접 만들면 된다.
		
		System.out.println(studentLee.showStudentInfo());
		
		
		
		Student studentKim = new Student(18122138, "kim", 4);
		System.out.println(studentKim.showStudentInfo());
		
		
	}

}
