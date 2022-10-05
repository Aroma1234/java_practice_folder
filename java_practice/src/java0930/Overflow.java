package java0930;

public class Overflow {

	public static void main(String[] args) {
		//나이 저장
		int age = 53;
		//int는 약 21억 정도까지만 저장
		//에러
		//age = 2200000000;
		
		//22억은 long에 저장
		long money = 2200000000L;
		
		//age = money;
		money = age;
		
		//char는 문자에 해당하는 코드를 저장
		//출력할 때 코드에 해당하는 문자를 출력
		char ch = 'A';
		System.out.println(ch);
		ch = 97;
		System.out.println(ch);
		
		//제어문자 사용
		System.out.println(
			"안녕하세요\n반갑습니다.");
		
		
		double d = 10.7;
		System.out.println(d);
		
		float f = 10.7f;
		System.out.println(f);
		
		double sum = 0.0;
		for(int i=0; i<100; i++) {
			sum = sum + 0.1;
		}
		System.out.println(sum);
		
		//실수를 정수로 강제로 
		//형 변환해서 대입
		int k = (int)10.456;
		System.out.println(k);
		
		double result =(double)10/4;
		System.out.println(result);
		
		byte b = 127;
		b = (byte)(127 + 1);
		System.out.println(b);
		
		
		

	}

}
