package page_1;

import java.util.ArrayList;

/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.
 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy
 * coded by plugcy
 */
public class test {

	public static void main(String[] args) {
		String s = "12345678";
		char[] ch = s.toCharArray();
		ArrayList<String> list = new ArrayList<>();
		for(int i =0;i<s.length()-1;i+=2){
			String ini = s.substring(i, i+2);
			list.add(ini);
		}
		System.out.println(list);
	}

}
