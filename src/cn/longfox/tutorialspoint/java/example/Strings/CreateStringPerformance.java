package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * �Ƚϴ����ַ��������ַ�ʽ�����ܣ�ֱ�ӳ�����ֵ��new��̬��������Ҫ��
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
