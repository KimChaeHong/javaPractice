package ch04;

public class Student {
	
	
	//클래스의 속성
	public int studentID;
	public String studentName;
	public String address;
	
	//클래스의 매서드 - 반환값은 없다. void로 명시
	public void showStudentInfo() {
		System.out.println(studentID + "학번 학생의 이름은 " +  studentName + "이고, 주소는 " + address);
	}
	
	//이름을 가져가는 함수 반환값은 String
	//이름을 지정하거나 반환하는 메서드
	//		┌반환값
	public String getStudentName() {
		return studentName;
	//			└ studentName 변수를 반환
	}
	
	//어떤 이름으로 바꾸겠다. 반환값은 없다. 어떤 이름으로 바꿀건지 매개변수가 있다.
	//어떤 이름으로 지정할 때 반환 값은 없고 어떤 이름으로 바꿀껀지 매개변수를 지정하는 메서드
	public void setStudentName(String name) {
		studentName = name;
	}

}
