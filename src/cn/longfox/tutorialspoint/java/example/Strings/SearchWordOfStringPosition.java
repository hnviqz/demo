package cn.longfox.tutorialspoint.java.example.Strings;
/**
 * ���ܣ�����ָ���������ַ����е�λ��
 * ʹ�õķ���ΪString���еķ���indexOf
 * �÷����ķ���ֵ��������ڷ�������λ��ֵ�����򷵻�-1
 * @author Administrator
 *
 */
public class SearchWordOfStringPosition {
	public static void main(String args[]){
		String str = "This Program\' function is search word in string";
		int nIndex = str.indexOf("se");
		System.out.println(str);
		if(-1==nIndex){
			System.out.println("the is no found!");
		}
		else{
			System.out.println("the word index at: "+nIndex);
		}
	}
}
