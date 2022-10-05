package java1004;

public class BitLogical {

	public static void main(String[] args) {
		int a = 11;
		/*
		//이진수로 변환한 결과 확인
		System.out.println(Integer.toBinaryString(a));
		*/
		int b = 14; //1110
		System.out.println(a & b); //1010
		System.out.println(a | b); //1111
		System.out.println(a ^ b); //0101
	}

}
