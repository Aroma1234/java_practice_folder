package java1004;

public class ArithmeticOperation_1 {

	public static void main(String[] args) {
		// 정수 데이터를 저장하는 변수
		int x = 10;
		int y = 4;
		System.out.println(x + y);
		//정수 나누기 정수는 정수
		System.out.println(x / y);
		
		byte b1 = 10;
		byte b2 = 4;
		byte result = (byte)(b1/b2);
		System.out.println(result);
		
		//정수 나누기 정수는 정수
		//정수 나누기 정수를 했을 때 소수까지 출력
		//x 나누기 y 했을 때 소수까지 나오도록
		double d = (float)x / y;
		System.out.println(d);
		
		//위의 결과를 소수 첫째 자리에서 반올림
		int t = (int)((double)x / y + 0.5);
		System.out.println(t);
		
		int money = 32760;
		//정수 두번째(십의) 자리 반올림 - 32800
		System.out.println((int)(money / 100.0 + 0.5)*100);
		

	}

}
