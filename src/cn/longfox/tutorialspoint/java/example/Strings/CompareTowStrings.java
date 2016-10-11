package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * 
 * @author Administrator
 * 功能：使用compareTo和compareToIgnoreCase比较两个字符串，并返回第一个不同字符之间的ASCII码
 * 的值。字符串的比较过程：遍历两个字符串中的每个字符中进行比较，当遇到两个字符串中的第一个不同
 * 的字符之后，求两个不同字符之间的ASCII码差值。
 */
public class CompareTowStrings {
	public static void main(String []args){
		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println(str.compareTo(anotherString));//Hello World与hello world开始后，先比较
		//H和h，两者不同，H的ASCII码为７２，ｈ的ASCII码为104,所以返回值为-32.
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));
	}
}
