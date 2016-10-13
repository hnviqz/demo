package cn.longfox.tutorialspoint.java.example.DataStruct;

public class SumWithStack {
	static int nums;
	static int ans;
	static Stack stackobj;
	
	public static void main(String []args){
		nums = 50;
		ans = 0;
		stackAddition();
		System.out.println(ans);
	}
	
	public static void stackAddition( ){
		stackobj = new Stack(10000);
		while(nums>0){
			stackobj.push(nums);
			--nums;
		}
		
		while(!stackobj.isEmpty()){
			int nTmp = stackobj.pop( );
			ans += nTmp;
		}
	}
}

/**
 * 类名：Stack
 * 类的作用：定义一个栈的数据结构。
 * 栈数据结果的特点：1）先进后出。
 * 描述一个栈的方法：1）栈容量，即栈的最大值；2）栈游标，当栈为空时，游标为-1；3）栈数据类型；
 * @author Administrator
 *
 */

class Stack{
	private int max_size;
	private int top;
	private int []stack;
	
	public Stack(int s){
		max_size = s;
		top = -1;
		stack = new int[max_size];
	}
	
	public void push(int i){
		stack[++top] = i;
	}
	
	public int pop( ){
		return stack[top--];
	}
	
	public int peek( ){
		return stack[top];
	}
	
	public boolean isEmpty( ){
		if(top==-1){
			return true;
		}
		return false;
	}
}