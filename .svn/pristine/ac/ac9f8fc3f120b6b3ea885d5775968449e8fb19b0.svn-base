package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * 
 * @author Administrator
 *使用lastIndexOf方法获取子串在字符串中最后出现的位置。
 */
public class searchStringOccurLastPos {
	
	
	
	public static int stringOccurPos(String str,String subString){
		int index = str.lastIndexOf(subString);
		if(index == -1)
			return -1; 
		return index;
	}
	
	public static void main(String args[]){
		String origStr = "Hello,world!Hello,World";
		String subStr = "World";
		
		int rel = stringOccurPos(origStr,subStr);
		if(1==rel){
			System.out.println("sub string no found!");
		}else{
			System.out.println("sub string found at " + rel );
		}
	}
}
