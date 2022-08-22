package ch03;

public class FunctionTest {
	
	//			   ┌반환값에 대한 데이터타입				
	public static int addNum(int num1, int num2) {//반환값, 매개변수
	//		 함수의 이름┘			└함수의 매개변수, 타입과 함께 변수이름을 적는다.
	//								 정수두개를 받아서 결과를 받아서 반환
		int result;
		result = num1 + num2;
		return result;
	//		└두 수를 받아서 반환하기 위한 키워드	
	}
	
	//수행만 하고 반환을 안하는 경우
	public static void sayHello(String greeting) { //매개변수
		System.out.println(greeting);
	}
	
	public static int calcSum() { //반환값
		int sum = 0;
		int i;
		
		for ( i = 0; i <= 100; i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);
		
		
	}

}
