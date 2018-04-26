package page_1;
/*
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * coded by plugcy
 */
public class demo2 {
	public static int Fibonacci(int n){
		if(n == 1)
			return 1;
		else if(n==2)
			return 1;
		else 
			return Fibonacci(n-1)+Fibonacci(n-2);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int result = Fibonacci(n);
		System.out.println(result);
	}

}
