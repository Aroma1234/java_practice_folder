package java1004;

public class ConditionLogical {

	public static void main(String[] args) {
		int year = 2022;
		//year 가 윤년인지 판별
		//4의 배수이고 100의 배수가 아니면 윤년
		//400의 배수는 윤년
		if(year%4 ==0 && year %100 !=0 || year %400 ==0) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년 아님");
		}
		//1부터 100까지에서 3의 배수이고 4의 배수인 숫자 찾기
		for(int idx=1; idx<=100; idx++) {
			if(idx%3 ==0 && idx%4 ==0);
			if(idx%4 ==0 && idx%3 ==0);
		}

	}

}
