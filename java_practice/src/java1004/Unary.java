package java1004;

public class Unary {

	public static void main(String[] args) {
		// 정수를 저장하는 변수를 생성
		int age = 26;
		System.out.println(age);
		
		//age가 가리키고 있는 데이터를 1 증가시킴
		age ++;
		System.out.println(age);
		
		//명령에 사용하고 1 증가 -> 27을 출력 후 28
		System.out.println(age++);
		//1 증가하고 명령에서 사용 -> 29되고 29 출력
		System.out.println(++age);

	}

}
