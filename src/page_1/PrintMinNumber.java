package page_1;
/*
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * ��һ��������������Ƕ��������е�ÿ����Ԫ��a,b,��ab<ba,����a��С�ڡ�b
 * coded by Jerome
 */
public class PrintMinNumber {
	public static String printMinNumber(int[] numbers){
		if(numbers.length==0)
			return "";
		int temp = 0;
		for(int i = 0;i<numbers.length-1;i++){
			for(int j = 0;j<numbers.length-1-i;j++){
				String s1 = String.valueOf(numbers[j])+String.valueOf(numbers[j+1]);
				String s2 = String.valueOf(numbers[j+1])+String.valueOf(numbers[j]);
				if(s1.compareTo(s2)>0){
					temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}	
		}
		String s = "";
		for(int i = 0;i<numbers.length;i++){
			s+= String.valueOf(numbers[i]);
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3,32,321};
		String min = printMinNumber(numbers);
		System.out.println(min);
	}

}
