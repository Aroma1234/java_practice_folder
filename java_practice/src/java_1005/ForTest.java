package java_1005;

public class ForTest {

	public static void main(String[] args) {
		for(int idx = 0; idx < 5; idx = idx + 1)
		System.out.println("Hello World");
		
		//1부터 10까지의 합을 for를 이용해서 구하기
		//합계를 저장할 변수
		int sum = 0;
		for(int i = 1; i < 11; i=i+1) {
			sum = sum + i;
		}
		System.out.println("합계: " + sum);
		

	}

}
