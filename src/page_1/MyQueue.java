package page_1;
/*
 * 用两个栈实现一个队列
 * coded by Jerome
 */
import java.util.Stack;

public class MyQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void put(int node){
		stack1.push(node);
	}
	public int pop(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty())
				stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue my = new MyQueue();
		my.put(1);
		my.put(2);
		System.out.println(my.pop());
	}

}
