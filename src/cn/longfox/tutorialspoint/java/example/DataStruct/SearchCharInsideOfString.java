package cn.longfox.tutorialspoint.java.example.DataStruct;

import java.util.LinkedList;

public class SearchCharInsideOfString {
	public static void main(String []args){
		LinkedList list = new LinkedList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		System.out.println(list);
		
		System.out.println("the position 2 element is: "+list.indexOf("3"));
		
	}
}
