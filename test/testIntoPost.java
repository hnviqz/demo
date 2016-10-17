import static org.junit.Assert.*;

import org.junit.Test;

import cn.longfox.tutorialspoint.java.example.DataStruct.InToPost;

public class testIntoPost {

	@Test
	public void test() {
		String input = "1+2*4/(5-7)+3/6";
		InToPost obj = new InToPost(input);
//		obj.doTrans();
		obj.stringToStack();
		String str = obj.gotParen();
		System.out.println(str);
	}
}
