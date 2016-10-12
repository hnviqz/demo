package cn.longfox.tutorialspoint.java.example.Strings;

public class DetermineUnicode {
	public static void main(String args[]){
		String str = "welcome to beijing";
		System.out.println(str);
		System.out.println("the 5 position: "+ str.codePointBefore(5));
	}
}
