package java_1005;

public class BreakTest {

	public static void main(String[] args) {
		for(int i=1; i<10; i=i+1) {
			System.out.println(i);
			
			//i가 3의 배수라면 반복문을 중단
			if(i % 3 == 0) {
				break;
			}
		}

	}

}
