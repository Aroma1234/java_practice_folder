package java_1005;

public class DoWhile {

	public static void main(String[] args) {
		//10 -> 8 -> 6 -> 4 ->2 ->0
		
		int idx = 0;
		do {
			System.out.println(10 -2*idx);
			idx = idx + 1;
		}while(idx <  6);

	}

}
