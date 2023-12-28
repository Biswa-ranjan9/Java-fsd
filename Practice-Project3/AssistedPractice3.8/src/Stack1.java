import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        System.out.println("%s pushed into stack");
        
        stack.push(20);
        System.out.println("20 pushed into stack");
        
        stack.push(30);
        System.out.println("30 pushed into stack");

        
        int poppedElement = stack.pop();
        System.out.println(poppedElement + " popped from stack");
        
        poppedElement = stack.pop();
        System.out.println(poppedElement + " popped from stack");
    }
}
