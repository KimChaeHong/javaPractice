package ch15;
import java.util.Scanner;

public class IfIfTestd {

	public static void main(String[] args) {

		int charge;

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 8) {
			System.out.println("미 취학 아동입니다.");
			charge = 10000;
		}
		if (age < 14) {
			charge = 1500;
			System.out.println("초등학생 입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");

	}

}
