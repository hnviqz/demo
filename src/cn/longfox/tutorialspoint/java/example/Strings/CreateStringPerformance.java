package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * 比较创建字符串的两种方式的性能，直接常量赋值比new动态分配性能要好
 * @author Administrator
 *
 */
public class CreateStringPerformance {
	public static void main(String []args){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			String s1 = "Hello";
			String s2 = "Hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("create string spent time is "+ (endTime-startTime));
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			String s1 = new String("Hello");
			String s2 = new String("Hello");
		}
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("create string1 spent time is "+ (endTime1-startTime1));
	}
}
