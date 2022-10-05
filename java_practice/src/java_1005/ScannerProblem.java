package java_1005;

import java.util.Scanner;

public class ScannerProblem {

	public static void main(String[] args) {
		Scanner sc =
				new Scanner(System.in);
		
		//나이 입력받기
		System.out.print("나이:");
		int age = sc.nextInt();
		
		//기존 버퍼의 내용 비우기
		sc.nextLine();
		
		//이름 입력받기
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("이름:" + name + " 나이:" + age);
		
		sc.close();
	}

}
