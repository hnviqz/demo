package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * 功能：查找指定的字在字符串中的位置
 * 使用的方法为String类中的方法indexOf
 * 该方法的返回值：如果存在返回所在位置值，否则返回-1
 * @author Administrator
 *
 */
public class SearchWordOfStringPosition {
	public static void main(String args[]){
		String str = "This Program\' function is search word in string";
		int nIndex = str.indexOf("se");
		System.out.println(str);
		if(-1==nIndex){
			System.out.println("the is no found!");
		}
		else{
			System.out.println("the word index at: "+nIndex);
		}
	}
}
