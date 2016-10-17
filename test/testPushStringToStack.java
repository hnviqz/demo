import static org.junit.Assert.*;
import org.junit.Test;
import cn.longfox.tutorialspoint.java.example.DataStruct.ReverseStringWithStack;

public class testPushStringToStack {

	@Test
	public void test() {
		ReverseStringWithStack obj = new ReverseStringWithStack();
		String input = "123456";
		obj.pushStringToStack(input);
		System.out.println("haha");
		String output = obj.doReverseString();
		System.out.println(output);	
	}
}
