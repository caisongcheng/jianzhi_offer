package page_1;

public class Find {
	public static boolean find(int target,int[][] array){
		int m = 0;
		int n = array[0].length-1;
		while(m<array.length&&n>=0){
			if(array[m][n] == target)
				return true;
			else if(array[m][n]>target)
				n--;
			else {
				m++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target= 5;
		int[][] array = {{1,3,4,6},{2,4,6,7},{5,8,9,10},{7,12,131,4}};
		boolean flag = find(target,array);
		System.out.println(flag);

	}

}
