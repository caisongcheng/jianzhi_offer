package page_1;
/*统计一个数字在排序数组中出现的次数。
 * coded byJerome
 */
public class GetNumberOfK {
	public static int Solution(int[] array,int k){
		if(array.length == 0)
			return 0;
		int first = GetFirstK(array,0,array.length-1,k);
		int last = GetLastK(array,0,array.length-1,k);
		if(first!=-1&&last!=-1)
			return last-first+1;
		else
			return 0;
	}
	public static int GetFirstK(int[] array,int start,int end,int k){
		if(start>end)
			return -1;
		int middle = (start+end)/2;
		if(array[middle]==k){
			if(middle==0||middle>0&&array[middle-1]!=k)
				return middle;
			else
				end = middle - 1;
		}
		else if(array[middle]>k)
			end = middle - 1;
		else {
			start = middle + 1;
		}
		return GetFirstK(array, start, end, k);
	}
	public static int GetLastK(int[] array,int start,int end,int k){
		if(start>end)
			return -1;
		int middle = (start+end)/2;
		if(array[middle]==k){
			if(middle==array.length-1||middle<array.length-1&&array[middle+1]!=k)
				return middle;
			else
				start = middle + 1;
		}
		else if(array[middle]>k)
			end = middle - 1;
		else {
			start = middle + 1;
		}
		return GetLastK(array, start, end, k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,6,6,6,6,8,9,12,15};
		int k = 6;
		int result = Solution(array, k);
		System.out.println(result);
	}

}
