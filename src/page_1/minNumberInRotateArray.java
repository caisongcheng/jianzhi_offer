package page_1;
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת��
 * ���������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * coded by Jerome
 */

public class minNumberInRotateArray {
	public static int RotateArray(int[] array){
		if(array.length==0)
			return 0;
		else {
			for(int i = 0;i<array.length-1;i++){
				if(array[i+1]<array[i])
					return array[i+1];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,4,5,1,2};
		int result = RotateArray(a);
		System.out.println(result);
	}

}
