package page_1;
/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
