package java_0929;

public class ConsolDisplay {
	
	public static void main(String[] args) {
		//자신의 것을 출력하고 이어서 출력
		System.out.print("Hello");
		System.out.print("World");
		System.out.println();
		//자신의 것을 출력하고 줄을 바꾼후
		//다음 내용을 출력
		System.out.println("Hello");
		System.out.println("World");
		//계산식은 계산 결과를 출력
		System.out.println(10 + 7);
		//메서드를 호출하면 리턴 값이 출력
		System.out.println(
				"Hi".toUpperCase());
		//문자열 과 + 를 하면 문자열 결합을 해서
		//출력
		System.out.println(
				"2" + 3);
		//3 + 5 = 8
		System.out.println(
				"3 + 5 = 8");
		System.out.println(
				"3 + 5 = " + 
						(3 + 5));
		
		System.out.printf("%05d\n", 20);
		System.out.printf("%05d\n", 127);
		
		System.out.printf(
				"%f\n", 14.9876);
		System.out.printf(
				"%.2f\n", 14.9876);
		}

}
