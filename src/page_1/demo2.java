package page_1;
/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
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
