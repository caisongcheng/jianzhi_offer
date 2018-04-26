package page_1;

public class replaceSpace {
	public static String replacespace(StringBuffer sb){
		int oldLen = sb.length()-1;
		for(int i = 0;i<=oldLen;i++){
			if(sb.charAt(i)==' ')
				sb.append("  ");
		}
		int newLen = sb.length()-1; 
		while(oldLen>=0){
			char c = sb.charAt(oldLen--);
			if(c == ' '){
				sb.setCharAt(newLen--, '0');
				sb.setCharAt(newLen--, '2');
				sb.setCharAt(newLen--, '%');
			}
			else {
				sb.setCharAt(newLen--, c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("we are happy");
		String s = replacespace(sb);
		System.out.println(s);
		
	}

}
