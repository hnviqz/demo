package cn.longfox.tutorialspoint.java.example.Strings;

/**
 * 
 * @author Administrator
 *	功能：通过reverse方法倒置一个给定的字符串：如
 *  字符串：“abcde”经过倒置后变成：“edcba”
 *
 *
 */



public class ReverseString {
	public static void main(String []args){
		String str = "abcde";
		String reverse = new StringBuffer(str).reverse().toString();
		
		System.out.println( "string reverse before is: " + str );
		System.out.println( "string reverse after is :" + reverse );
	}
}
