package java1004;

public class LoginTest {

	public static void main(String[] args) {
		String id = "itstudy";
		
		//id의 값이 itstudy 이면 존재하는 아이디
		//그렇지 않으면 존재하지 않는 아이디라고 출력
		if(id == "itstudy") {
			System.out.println("존재하는 아이디");
		}else {
			System.out.println("존재하지 않는 아이디");
		}
		
		String pw = "134";
		//id가 itstudy 이고 pw가 1234 이면
		//로그인 성공
	    //그렇지 않으면 로그인 실패라고 출력
		if(id == "itstudy" && pw == "1234") {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		//아이디가 itstudy 이고 pw가 1234이면
		//로그인 성공
		//아이디는 itstudy 인데 pw가 1234가 아니면
		//비밀번호가 틀렸다고
		//그 이외의 경우는 없는 아이디라고 출력
		if(id == "itstudy" && pw == "1234") {
			System.out.println("로그인 성공");
		}else if(id == "itstudy") {
			System.out.println("비밀번호가 틀렸습니다");
		}else {
			System.out.println("없는 아이디입니다");
		}
	}

}
