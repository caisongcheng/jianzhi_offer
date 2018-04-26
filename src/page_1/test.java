package page_1;

import java.util.ArrayList;

/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy
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
