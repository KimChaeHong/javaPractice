package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		Student studentKim = new Student(100, "kim");
		studentKim.setKoreaSubject("국어", 100);
		studentKim.setMathSubject("수학", 99);
		
		Student studentLee = new Student(100, "kim");
		studentLee.setKoreaSubject("국어", 89);
		studentLee.setMathSubject("수학", 67);
		
		studentKim.showScoreInfo();
		studentLee.showScoreInfo();
		

	}

}
