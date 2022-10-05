package java0930;

public class IntegerTest {

	public static void main(String[] args) {
		//10이라는 데이터를 x가 가리키도록 설정
		int x = 10;
		//primitive type이 아님
		int [] ar = {10, 20, 30};
		
		System.out.println(x);
		System.out.println(ar);
		
		//x가 30을 가리키도록 변경
		x = 30;
		System.out.println(x);
		
		//int x = 30; //두번만들어서 에러
		//System.out.println(y);
		//없어서 에러
		
		
	}

}
