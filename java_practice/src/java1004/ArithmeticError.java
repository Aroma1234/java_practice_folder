package java1004;

public class ArithmeticError {

	public static void main(String[] args) {
		//잘못된 결과
		System.out.println(1.0 - 0.8);
		//0으로 나누어서 에러
		//0이 아니라 0.0으로 나누면 infinity나 nan이 나올 수 있는데 이 경우는
		//무한정 나눌 수 있는 경우나 숫자가 아니다 라는 의미
		System.out.println(1 / 0.0);

	}

}
