package page_1;
/*
 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S��
 * ����ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * coded by Jerome
 */
import java.util.ArrayList;

public class FindNumbersWithSum {
	public static ArrayList<Integer> Solution(int[] array,int sum){
		int low = 0;
		int high = array.length-1;
		int sim = 0;
		ArrayList<Integer> li = new ArrayList<>();
		while(low<=high){
			if(array[low]+array[high]>sum)
				high--;
			else if(array[low]+array[high]<sum)
				low++;
			else{

				if(li.size()==0){
					li.add(array[low]);
					li.add(array[high]);
					sim = high*low;
				}
				else{
					if(array[low]*array[high]<sim){
						li.clear();
						li.add(array[low]);
						li.add(array[high]);
					}
				}
				low++;
				high--;
			}
		}
		return li;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li = new ArrayList<>();
		int[] array = {4,4,6,8,10,14};
		int sum = 14;
		li = Solution(array,sum);
		System.out.println(li);
	}

}
