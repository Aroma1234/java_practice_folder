package java0930;

public class BooleanTest {

	public static void main(String[] args) {
		//boolean 변수 만들고 출력하기
		boolean isPan = true;
		System.out.println(isPan);
		
		System.out.println(
				"123".isBlank());
		System.out.println(
				"123".isEmpty());
		
		//문자열 저장
		String name = "박문석";
		System.out.println(name);
		
		int a = 10;
		int b = 10;
		System.out.println(
			System.identityHashCode(a));
		System.out.println(
			System.identityHashCode(b));
		
		
			

	}

}
