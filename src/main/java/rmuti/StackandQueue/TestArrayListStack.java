package rmuti.StackandQueue;

public class TestArrayListStack {

	public static void main(String[] args) {
		ArrayListStack stack = new ArrayListStack();
		stack.push("macos");
		stack.push("linux");
		stack.push("windows");
		System.out.println(stack);
		String data = (String)stack.pop();
		System.out.println(stack);
		
	}

}
