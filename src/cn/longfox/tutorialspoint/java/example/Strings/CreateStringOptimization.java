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
		
		System.out.println("ʹ��new�ؼ��ִ�����string���󻨷ѵ�ʱ�䣺"+(endTime1-startTime1)+"ms");
		
		long startTime2 = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			variables[i] = new String("hello");
			variables[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("ʹ��intern���������ַ��������ʱ�仨�ѣ�"+(endTime2-startTime1)+"ms");
		
		
		
		
		
		
	}
}
