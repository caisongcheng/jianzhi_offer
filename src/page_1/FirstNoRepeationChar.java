package page_1;

import java.util.LinkedHashMap;



public class FirstNoRepeationChar {
	public static int firstNoRepeationChar(String str){
		if(str.equals(""))
			return -1;
		LinkedHashMap<String, Integer> li = new LinkedHashMap<String, Integer>();
		for(int i =0;i<str.length();i++){
			String key = str.substring(i, i+1);
			if(li.containsKey(key))
				li.put(key,li.get(key)+1);
			else
				li.put(key,1);
		}
		String result = "";
		for(String s:li.keySet()){
			if(li.get(s)==1){
				result = s;
				break;
			}
		}
		if(result.equals(""))
			return -1;
		for(int i = 0;i<str.length();i++){
			if(result.equals(str.substring(i, i+1)))
				return i;
		}
		return 0;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asssacccmzemn";
		int index = firstNoRepeationChar(s);
		System.out.println(index);
	}

}
