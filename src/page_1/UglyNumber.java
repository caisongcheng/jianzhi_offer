package page_1;

public class UglyNumber {
	public static int GetUglyNumber_Solution(int index) {
		if(index == 0)
			return 0;
		int number = 0;
		int count = 0;
		while(count<index){
			number++;
			if(isUglyNumber(number))
				count++;
		}
		return number;
		
	}
	public static boolean isUglyNumber(int number){
		while(number%2==0)
			number = number/2;
		while(number%3==0)
			number = number/3;
		while(number%5==0)
			number = number/5;
		return number == 1?true:false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 1500;
		int result = GetUglyNumber_Solution(index);
		System.out.println(result);
	}

}
