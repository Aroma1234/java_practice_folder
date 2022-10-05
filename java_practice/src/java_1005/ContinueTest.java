package java_1005;

public class ContinueTest {

	public static void main(String[] args) {
		for(int i=1; i<10; i=i+1) {
			//3의 배수일때는
			//다음 반복으로 넘어가기
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}