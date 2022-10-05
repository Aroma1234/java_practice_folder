package java1004;

public class IfTest {

	public static void main(String[] args) {
		// 점수 저장
		int score = 50;
		
		//score 가 60 이상이면 합격이라고 출력
		/*if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		*/
		
		//80에서 100 사이면 우수
		//60에서 79 사이면 보통
		//0에서 59 사이면 노력 이라고 출력
		if(score >= 80 && score < 100) {
			System.out.println("우수");
		}else if (score >=60 && score < 80) {
			System.out.println("보통");
		}else if (score >=0 && score < 60) {
			System.out.println("노력");
		}else {
			System.out.println("잘못된 점수");
		}

	}

}
