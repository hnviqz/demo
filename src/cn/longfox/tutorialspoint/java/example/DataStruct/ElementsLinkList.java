package cn.longfox.tutorialspoint.java.example.DataStruct;
import java.util.LinkedList;
/**
 * ʵ��һ���������͵�����
 * ʹ�õķ���Ϊ��LinkList��add();
 * @author Administrator
 *
 */
public class ElementsLinkList {
	public static void main(String args[]){
		LinkedList Listdemo =  new LinkedList();
		Listdemo.add("200");
		Listdemo.add("300");
		Listdemo.add("400");
		Listdemo.add("500");
		System.out.println("the first element is "+Listdemo.getFirst());
		System.out.println("the last element is "+Listdemo.getLast());
		System.out.println("XXX");
	}
}
