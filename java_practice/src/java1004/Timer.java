package java1004;

public class Timer {

	public static void main(String[] args) {
		//시간을 계산하는 문제
		//99980초가 몇 시간 몇 분 몇 초인지 계산
		//1시간은 3600초
		int time = 99980;
		int hour = time / 3600;
		int minute = (time - (hour * 3600))/60;
		
		//초는 분까지를 제외한 부분
		int second = time % 60;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");

	}

}
