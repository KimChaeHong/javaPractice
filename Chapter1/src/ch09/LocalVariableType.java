package ch09;

public class LocalVariableType {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
		//str = 3; //스크립트 언어에서는 가능할지라도 자바에서는 안된다.
					//알맞는 데이터 형으로 써야한다.
		
		System.out.println(str);

	}

}
