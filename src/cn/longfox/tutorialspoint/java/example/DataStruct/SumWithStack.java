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
 * ������Stack
 * ������ã�����һ��ջ�����ݽṹ��
 * ջ���ݽ�����ص㣺1���Ƚ������
 * ����һ��ջ�ķ�����1��ջ��������ջ�����ֵ��2��ջ�α꣬��ջΪ��ʱ���α�Ϊ-1��3��ջ�������ͣ�
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