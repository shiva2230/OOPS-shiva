package StackPushPop;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <String> stack= new Stack<>();
        stack.push("Shiva");
        stack.push("Amjad");
        stack.push("Nidal");
        stack.push("Fayaz");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

    }


}
