package page_1;
/*
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 做一个排序，排序规则是对于数组中的每两个元素a,b,若ab<ba,则定义a“小于”b
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
