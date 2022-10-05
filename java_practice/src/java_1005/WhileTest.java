package java_1005;

public class WhileTest {

	public static void main(String[] args) {
		// Hello Java를 다섯번 출력
		int idx = 0;
		
		while(idx < 5) {
			idx = idx + 1;
			System.out.println(idx);
			//idx = ++idx
		}
		
		//Hello World를 3번 출력
		int hw = 0;
		
		while(hw < 3) {
			hw = hw + 1;
			System.out.println("Hello World");
		}
		
		//image1.png, image2.png, image3.png를 반복문으로 출력
		int asdf = 0;
		
		while (asdf < 3) {
			
			System.out.println("image"+(asdf+1)+".png");
		    asdf = asdf + 1;
		}
		
		

	}

}
