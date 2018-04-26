package page_1;

import java.util.ArrayDeque;

import javax.swing.Popup;

/*
 * 用两个队列实现栈
 * coded by Jerome
 */
public class MyStack {
	ArrayDeque<Integer> aq1 = new ArrayDeque<>();
	ArrayDeque<Integer> aq2 = new ArrayDeque<>();
	public void push(int node){
		aq1.add(node);
	}
	public int pop(){
		if(aq1.size()==1)
			return aq1.remove();
		else {
			int result = 0;
			while(aq1.size()>1)
				aq2.add(aq1.remove());
			result = aq1.remove();
			while(!aq2.isEmpty())
				aq1.add(aq2.remove());
			return result;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms = new MyStack();
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.push(5);
		System.out.println(ms.pop());
		ms.push(6);
		System.out.println(ms.pop());
		
	}

}
