package cn.longfox.tutorialspoint.java.example.Strings;

public class ReverseString {
	public static void main(String []args){
		String str = "abcde";
		String reverse = new StringBuffer(str).reverse().toString();
		
		System.out.println( "string reverse before is: " + str );
		System.out.println( "string reverse after is :" + reverse );
	}
}
