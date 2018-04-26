package page_1;

import java.util.ArrayList;
/*
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * coded by Jerome
 */

import javax.xml.stream.events.EndDocument;


public class GetLeastNumbers_Solution1 {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(input==null||input.length<=0)
			return list;
		if(k<=0||k>input.length)
			return list;
		int low = 0;
		int high = input.length-1;
		int index = Partition(input,low,high);
		while(index!=k-1){
			if(index>k-1){
				high = index -1;
				index = Partition(input,low,high);
			}
			else {
				low = index + 1;
				index = Partition(input,low,high);
			}
		}
		for(int i =0;i<k;i++)
			list.add(input[i]);
		return list;
	}
	public static int Partition(int[] a,int low,int high){
		int pivot = a[low];
		int i = low;
		while(low<high){
			while(low<high&&a[high]>=pivot)
				high--;
			while(low<high&&a[low]<=pivot)
				low++;
			if(low<high){
				int temp = a[high];
				a[high] = a[low];
				a[low] = temp;
			}
		}
		a[i] = a[low];
		a[low] = pivot;
		return low;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,5,1,6,2,7,3,8};
		
		int k = 4;
		ArrayList<Integer> list = new ArrayList<>();
		list = GetLeastNumbers_Solution(input,k);
		System.out.println(list);
	}

}
