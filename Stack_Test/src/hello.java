import java.util.Stack;

public class hello {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();
        stack.push("Test");
        String next = stack.pop();
        System.out.println(next);
    }
}
