package page_1;
/*
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
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
