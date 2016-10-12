package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * 使用toUpperCase方法实现小写字母转换成大写字母的字符串
 * @author Administrator
 *
 */
public class ConvertUpCase {
	public static void main(String[] args){
		String str = "convert abc to upper case";
		String strUp = "";
		strUp = str.toUpperCase();
		System.out.println("strUp is: "+strUp);
	}
}
