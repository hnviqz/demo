package cn.longfox.tutorialspoint.java.example.Strings;

public class SplitString {
	/**
	 * @param args
	 */
	public static void main(String args[]){
		String str = "the-oa-system";
		String []tmp;
		String delimeter = "-";
		
		tmp = str.split(delimeter);
		/*
		 *   tmp[0] == the
		 *   tmp[1] == oa
		 *   tmp[2] == system
		 */
		for(int i=0;i<tmp.length;i++){
			System.out.println(tmp[i]);
			System.out.println("");
			str = "the.oa.system";
			delimeter = "\\.";
			tmp = str.split(delimeter);
		}
		
		for(int i=0;i<tmp.length;i++){
			System.out.println(tmp[i]);
			tmp = str.split(delimeter,2);
			for(int j=0;j<tmp.length;j++){
				System.out.println(tmp[j]);
			}
		}
	}
}
