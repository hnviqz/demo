package cn.longfox.tutorialspoint.java.example.Strings;

public class ReplaceString {
//	String str = "This is Replace string function";
	public static void main(String args[]){
		String  str = "This is Replace string function";
		System.out.println(str.replace("T", "t"));
		System.out.println(str.replaceFirst("is","are"));
		System.out.println(str.replaceAll("t","d"));
	}
}
