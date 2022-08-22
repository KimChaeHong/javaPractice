package ch09;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		//nullpointexception 발생할 수 있기 때문에 
		//보통 참조변수로 맴버변수를 생성자에서 한다.
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectname = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectname = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName +"학생의 총점은 " + total +"점 입니다.");
	}






	
	
	 
	
	
	
	
	
}
