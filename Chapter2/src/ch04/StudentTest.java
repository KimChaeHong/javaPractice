package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		//			┌참조 변수 - 생성되는 곳의 메모리 위치
		Student studentLee = new Student(); //하나의 클래스를 기반으로 여러개의 인스턴스가 생긴다.
		//						└생성자
	
		studentLee.studentID =12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 광진구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 12346;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
