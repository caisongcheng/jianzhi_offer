package page_1;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * coded by plugcy
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		String s = "we are happy";
		char[] ch = s.toCharArray();
		for(int i = 0;i<ch.length;i++){
			if (ch[i] == ' '){
				sb.append("%20");
			}
			else
				sb.append(ch[i]);
		}
		System.out.println(sb.toString());
	}

}
