package page_1;

public class NumberOf1 {
	public static int numberOf1(int n){
		int count = 0;
		if(n==0)
			return 0;
		else if(n<0){
			n = n&0x7FFFFFFF;
			count++;
			}
		while(n!=0){
				if((n&1)==1)
					count += 1;
				n = n >> 1;
		}
			return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -5;
		int result = numberOf1(n);
		System.out.println(result);
	}

}
