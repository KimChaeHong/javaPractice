package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);

		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//char ch = -55; //음수는 사용할 수 없다.
		
		char ch5 ='한';
		char ch6 ='\uD55C';
		System.out.println(ch5);
		System.out.println(ch6);
		
	}

}
