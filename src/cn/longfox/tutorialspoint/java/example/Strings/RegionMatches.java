package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * RegionMatches.java
 * 创建日期：2016-10-12
 * 功能：测试两个字符串中的相同区域
 * @author Administrator
 *
 */
public class RegionMatches {
	public static void main(String args[]){
		String strFirst = "welcome to microsoft";
		String strSecond = "I am work with microsoft";
		boolean isEqui = false;
		isEqui = strFirst.regionMatches(11, strSecond, 15, 9);
		System.out.println(isEqui);
	}
}
