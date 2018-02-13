package lab5;

import java.util.EmptyStackException;

public class StackTest {
    public static void main(String[] args) {
        LinkedChainStack<String> linkedChainStack = new LinkedChainStack<>();

        linkedChainStack.push("A");
        System.out.println(linkedChainStack.isEmpty());
        linkedChainStack.push("B");
        System.out.println(linkedChainStack.pop());
        System.out.println(linkedChainStack.peek());
        System.out.println(linkedChainStack.isEmpty());

        linkedChainStack.clear();
        System.out.println(linkedChainStack.isEmpty());
        try {
            System.out.println(linkedChainStack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Yeet error thrown");
        }
        System.out.println(linkedChainStack.isEmpty());

        try {
            System.out.println(linkedChainStack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Yeet error thrown");
        }
        linkedChainStack.push("C");
        linkedChainStack.push("D");
        linkedChainStack.push("E");

        System.out.println(linkedChainStack.isEmpty());


    }


}
