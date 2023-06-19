package StackRemoveAtPosition;
import java.util.*;
public class Stack2 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        List<String> list=new ArrayList<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack);
        stack.removeElementAt(1);
        System.out.println(stack);
        stack.remove(1);

    }

}
