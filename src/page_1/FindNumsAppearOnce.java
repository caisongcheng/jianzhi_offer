package page_1;
/*
 * 一个整型数组里除了一个数字之外，其他的数字都出现了三次。请写程序找出这个只出现一次的数字。
 * coded by Jerome
 */
public class FindNumsAppearOnce {
	public static void findNumsAppearOnce(int[] array,int[] a){
		if (array.length==0)
			return;
		int[] temp = new int[32];
		for(int i = 0;i<array.length;i++){
			int bitMask = 1;
			for(int j = 31;j>=0;j--){
				int bit = (bitMask&array[i]);
				if(bit!=0)
					temp[j]+=1;
				bitMask = bitMask<<1;
				
			}
		}
		int result = 0;
		for(int i = 0;i<32;i++){
			result = result<<1;
			result += temp[i]%3;
		}
		a[0] = result;
		//System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,2,4,4,6,6,6,12,12,12};
		int[] a = {0};
		findNumsAppearOnce(array,a);
		System.out.println(a[0]);
	}

}
