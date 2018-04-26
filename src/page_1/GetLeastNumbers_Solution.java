package page_1;
/*
 * ����n���������ҳ�������С��K������
 * ��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * coded by Jerome
 */

import java.util.ArrayList;

public class GetLeastNumbers_Solution {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
		if(input==null||input.length<=0)
			return null;
		if(k<=0||k>input.length)
			return null;
		HeapSort(input,k);
		for(int i = k;i<input.length;i++){
			if(input[0]<input[i])
				continue;
			else{
				input[0] = input[i];
				adjustDown(input, 0, k);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<k;i++)
			list.add(input[i]);
		return list;

}
	public static void HeapSort(int[] a,int k){
		buildHeap(a,k);
	}
	public static void buildHeap(int[] a,int k){
		for(int i =(k-1)/2;i>=0;i--){
			adjustDown(a,i,k);
		}
	}
	public static void adjustDown(int[] a,int i,int len){
		int temp = a[i];
		for(int j =2*i+1;j<len;j=2*j+1){
			if(j+1<len&&a[j]<a[j+1])
				j++;
			if(a[j]<temp)
				break;
			else{
				a[i] = a[j];
				i = j;
			}
		}
		a[i] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,5,1,6,2,7,3,8};
		int k = 10;
		ArrayList<Integer> list = new ArrayList<>();
		list = GetLeastNumbers_Solution(input,k);
		System.out.println(list);
	}

}
