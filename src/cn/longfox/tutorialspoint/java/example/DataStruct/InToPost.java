package cn.longfox.tutorialspoint.java.example.DataStruct;

import java.io.IOException;

/**
 * 把infix转postfix
 * 
 * @author Administrator
 *
 */
public class InToPost {
	private String input;
	private String output="";
	private Stack stack;

	public InToPost(String in) {
		input = in;
		int size = input.length();
		stack = new Stack(size);
	}

	public String doTrans() {
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			switch (ch) {
			case '+':
			case '-':
				gotOper(ch, 1);
				break;
			case '*':
			case '/':
				gotOper(ch, 2);
				break;
			case '(':
				stack.push(ch);
				break;
			case ')':
				gotParen();
				break;
			default:
				output = output + ch;
				break;
			}
		}
		while (!stack.isEmpty()) {
			output = output + stack.pop();
		}
		System.out.println(output);
		return output;
	}

	public String gotParen() {
		while (!stack.isEmpty()) {
			char ch = stack.pop();
			if ('(' == ch)
				break;
			else
				output += ch;
		}
		return output;
	}

	public void gotOper(char opThis, int prec1) {
		while (!stack.isEmpty()) {
			char opTop = stack.pop();
			if (opTop == '(') {
				stack.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1) {
					stack.push(opTop);
					break;
				} else
					output = output + opTop;
			}
		}
		stack.push(opThis);
	}

	public static void main(String[] args) throws IOException {
		String input = "1+2*4/5-7+3/6";
		String output;
		InToPost theTrans = new InToPost(input);
		output = theTrans.doTrans();
		System.out.println("Postfix is " + output + '\n');
	}

	public class Stack {
		private int size;
		private char[] arr;
		private int top;

		// 栈的初始化
		public Stack(int maxSize) {
			this.size = maxSize;
			this.top = -1;
			arr = new char[size];
		}

		// 入栈操作
		public void push(char ch) {
			arr[++top] = ch;
		}

		// 弹出栈操作
		public char pop() {
			return arr[top--];
		}

		// 检查栈是否为空
		public boolean isEmpty() {
			if (top == -1)
				return true;
			return false;
		}

		// 取栈中的指定元素
		public char peek() {
			return arr[top];
		}
	}
}
