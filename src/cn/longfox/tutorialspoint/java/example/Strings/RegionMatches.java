package cn.longfox.tutorialspoint.java.example.Strings;

public class RegionMatches {
	public static void main(String args[]){
		String strFirst = "welcome to microsoft";
		String strSecond = "I am work with microsoft";
		boolean isEqui = false;
		isEqui = strFirst.regionMatches(11, strSecond, 15, 9);
		System.out.println(isEqui);
	}
}
