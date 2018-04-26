package page_1;
/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * coded by Jerome
 */
public class MoreThanHalfNum_Solution {
	public static int solution(int[] array){
		if(array == null||array.length<=0)
			return 0;
		int count = 1;
		int result = array[0];
		for(int i = 1;i<array.length;i++){
			if(array[i]!=result)
				count--;
			else
				count++;
			if(count == 0){
				result = array[i];
				count = 1;
			}
		}
		if(checkMoreThanHalf(array,result))
			return result;
		else
			return 0;
	}
	public static boolean checkMoreThanHalf(int[] array,int result){
		boolean flag = false;
		int number = 0;
		for(int i = 0;i<array.length;i++){
			if(array[i]==result)
				number++;
			else
				continue;
		}
		if(number*2>array.length)
			flag = true;
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,2,4,6,2,2};
		int result = solution(array);
		System.out.println(result);
	}

}
