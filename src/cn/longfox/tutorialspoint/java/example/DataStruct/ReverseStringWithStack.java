package cn.longfox.tutorialspoint.java.example.DataStruct;

public class ReverseStringWithStack {

}


class MyStack<E>{
	private E stack[];
	private int size;
	private int top;
	
	public MyStack(int size){
		this.size = size;
		this.top = -1;
	}
}