package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * 
 * @author Administrator
 * ���ܣ�ʹ��compareTo��compareToIgnoreCase�Ƚ������ַ����������ص�һ����ͬ�ַ�֮���ASCII��
 * ��ֵ���ַ����ıȽϹ��̣����������ַ����е�ÿ���ַ��н��бȽϣ������������ַ����еĵ�һ����ͬ
 * ���ַ�֮����������ͬ�ַ�֮���ASCII���ֵ��
 */
public class CompareTowStrings {
	public static void main(String []args){
		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println(str.compareTo(anotherString));//Hello World��hello world��ʼ���ȱȽ�
		//H��h�����߲�ͬ��H��ASCII��Ϊ���������ASCII��Ϊ104,���Է���ֵΪ-32.
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));
	}
}
