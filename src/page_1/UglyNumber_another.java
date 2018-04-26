package page_1;

public class UglyNumber_another {
	public static int GetUglyNumber_Solution(int index){
		if(index == 0)
			return 0;
		int count = 1;
		int[] a = new int[index];
		a[0] = 1;
		int p2 = 0;
		int p3 = 0;
		int p5 = 0;
		int min = 0;
		while(count<index){
			min = a[p2]*2>a[p3]*3?a[p3]*3:a[p2]*2;
			min = min<a[p5]*5?min:a[p5]*5;
			a[count] = min;
			
			while(a[p2]*2<=a[count])
				p2++;
			while(a[p3]*3<=a[count])
				p3++;
			while(a[p5]*5<=a[count])
				p5++;
			count++;
		}
		return a[count-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 1500;
		int result = GetUglyNumber_Solution(index);
		System.out.println(result);
	}

}
