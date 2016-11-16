package cn.longfox.tutorialspoint.java.example.DataStruct;
/**
 * 通过LinkedList的方法向链表中加入指定位置的元素
 */
import java.util.LinkedList;
/**
 * 
 * @author Administrator
 *
 */
public class AddListElement {
	public static void main(String []args)
	{
		LinkedList llist = new LinkedList();
		llist.add("1");
		llist.add("2");
		llist.add("3");
		llist.add("4");
		llist.add("5");
		System.out.println("add element before list: "+llist);
		llist.addFirst("0");
		llist.addLast("7");
		System.out.println("add element after list: "+llist);
		System.out.println("list size: "+llist.size() ); //test
	}
}
