package java_1005;

public class ControlEtc {

	public static void main(String[] args) {
		int score = 90;
		// 제어문의 실행 내용이 한 문장이면
		//{ }를 생략할 수 있다
		if(score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		outer: for(int i=0; i<3; i++) {
			System.out.println("외부 반복문 시작");
			
			for(int j=0; j<3; j++) {
				System.out.println("내부 반복문");
				//outer라는 레이블이 붙은
				//반복문을 종료
				break outer;
			}
			System.out.println("외부 반복문 종료");
			
		}

	}

}
