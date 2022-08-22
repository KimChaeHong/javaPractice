package ch08;

public class Human {
	
	public int tall;
	public int weight;
	public String name;
	public int age;
	
	public Human(int i, int j, String string, int k) {
		this.tall = i;
		this.weight = j;
		this.name = string;
		this.age = k;
	}

	public String showHumanInfo() {
		return "키가 " +tall +"이고 몸무게가 " + weight + 
				"킬로인 남성이 있습니다. 이름은 " +name+ "이고 나이는 " +age+"세입니다.";
	}
	

}
