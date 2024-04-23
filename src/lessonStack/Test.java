package lessonStack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(17);
        stack.push(2);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        while(!stack.empty())
            System.out.println(stack.pop());

    }
}
