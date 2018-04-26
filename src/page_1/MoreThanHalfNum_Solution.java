package page_1;
/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
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
