package cn.longfox.tutorialspoint.java.example.DataStruct;

public class ReverseStringWithStack {
	private String input;
	private String output;
	private MyStack theStack;
	
	public MyStack getTheStack() {
		return theStack;
	}

	public void setTheStack(MyStack theStack) {
		this.theStack = theStack;
	}

	public ReverseStringWithStack( ){
		this.input = "";
		this.output = "";
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	public void pushStringToStack(String input){
		char []ch = input.toCharArray();
		this.theStack = new MyStack(ch.length);
		for(int i=0;i<ch.length;i++){
			theStack.push(ch[i]);
		}
	}
	
	public String doReverseString( ){
		while(!this.theStack.isEmpty()){
			char ch = this.theStack.pop();
			this.output += ch;
		}
		return this.output;
	}
	
	
	
	public static void main(String []args){
		
	}
}


class MyStack{
	private char []stack;
	private int size;
	private int top;
	
	public MyStack(int size){
		this.size = size;
		this.top = -1;
		stack = new char[size];
	}
	
	public boolean isEmpty( ){
		if(-1==top){
			return true;
		}
		return false;
	}
	
	public void push(char ch){
		stack[++top]=ch;
	}
	
	public char pop( ){
		return stack[top--];
	}
	
	public char peek(){
		return stack[top];
	}
}