package java_1005;

public class SwitchTest {

	public static void main(String[] args) {
		//menu가 1번이면 한식
		//2번이면 중식
		//3번이면 기타
		int menu = 2;
		if(menu == 1) {
			System.out.println("한식");
		}else if(menu == 2) {
			System.out.println("중식");
		}else if(menu == 3) {
			System.out.println("기타");
		}else {
			System.out.println("잘못된 메뉴");
		}
		
		//final을 붙이면 변경할 수 없음
		final int KOREA = 1;
		//위의 처리를 switch로 처리
		switch(menu) {
		case 1:
			System.out.println("한식");
			break;
		case 2:
			System.out.println("중식");
			//break;
		case 3:
			System.out.println("기타");
			break;
		default:
			System.out.println("잘못된 메뉴");
			break;
		}

	}

}
