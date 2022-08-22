package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		//int age = 6;

		Scanner scanner = new Scanner(System.in);
		System.out.print("나이가 몇인가요.? ");
		int age = scanner.nextInt();

		
		if (age >= 25) {
			System.out.println("직장에 다닙니다.");
		} else {
			System.out.println("백수입니다.");
		}
		System.out.println("노는게 제일 좋아");

	}

}
