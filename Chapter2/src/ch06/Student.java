package ch06;

/**
 * @author coghd
 * 2022. 8. 22. - 오전 10:14:05
 */
public class Student {
	
	//Student 클래스의 인스턴스 들
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) {
		
		//   ┌멤버변수			┌매개변수
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	//Student 클래스의 생성자
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
	
}
