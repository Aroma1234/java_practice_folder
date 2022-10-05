package java_1005;

public class NestedIf {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 직접 입력
		String id = "itstudy";
		String pw = "1234";

		//id가 itstudy 라면 비밀번호를 비교하고
		//그렇지 않으면 없는 아이디라고 출력
		if(id == "itstudy") {
			//pw 가 1234면 로그인 성공
			//그렇지 않으면 잘못된 비밀번호
			if(pw == "1234") {
				System.out.println("로그인 성공");
			}else {
				System.out.println("잘못된 비밀번호");
			}
		}else {
			System.out.println("없는 아이디");
		}

	}

}
