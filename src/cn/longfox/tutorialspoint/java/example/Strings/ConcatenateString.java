package cn.longfox.tutorialspoint.java.example.Strings;

public class ConcatenateString {
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			String result = "hello" + "world";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("concatenate two string with + char spent time is "+(endTime-startTime)+"ms");
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			StringBuffer result = new StringBuffer();
			result.append("hello");
			result.append("world");
		}
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("conatenate two string with append method time is "+(endTime1-startTime1)+"ms");
	}
}
