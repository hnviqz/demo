package cn.longfox.tutorialspoint.java.example.Strings;

public class CreateStringOptimization {
	public static void main(String args[]){
		
		String variables[] = new String[50000];
		
		for(int i=0;i<50000;i++){
			variables[i] = "s"+i;
		}
		long startTime = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			variables[i] = "hello";
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Create time of string literal is "+(endTime-startTime)+"ms");
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			variables[i] = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("使用new关键字创建的string对象花费的时间："+(endTime1-startTime1)+"ms");
		
		long startTime2 = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			variables[i] = new String("hello");
			variables[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("使用intern方法创建字符串对象的时间花费："+(endTime2-startTime1)+"ms");
		
		
		
		
		
		
	}
}
