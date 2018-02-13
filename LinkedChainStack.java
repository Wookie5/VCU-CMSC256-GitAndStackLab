package lab5;

import java.util.EmptyStackException;

public class LinkedChainStack<T> implements StackInterface<T> {
    private Node<T> rootNode;

    public LinkedChainStack() {
        rootNode = null;
    }

    @Override
    public void push(T newEntry) {
        if (this.isEmpty())
            rootNode = new Node<>(newEntry);
        else {
            pushH(newEntry, rootNode);
        }
    }

    private void pushH(T newEntry, Node curNode) {
        if (curNode.getNextNode() != null)
            pushH(newEntry, curNode.getNextNode());
        else {
            curNode.setNextNode(new Node<>(newEntry));
        }
    }

    @Override
    public T pop() {
        if (this.isEmpty())
            throw new EmptyStackException();
        else if(rootNode.getNextNode() == null){
            T value = rootNode.getValue();
            rootNode = null;
            return value;
        }
        else {
            return popH(rootNode, rootNode.getNextNode());
        }
    }

    private T popH(Node<T> prevNode, Node<T> curNode) {
        if (curNode.getNextNode() == null) {
            prevNode.setNextNode(null);
            return curNode.getValue();

        }

        return popH(curNode, curNode.getNextNode());
    }

    @Override
    public T peek() {
        if (this.isEmpty())
            throw new EmptyStackException();
        else
            return peekH(rootNode);
    }

    private T peekH(Node<T> curNode){
        if (curNode.getNextNode() == null) {
            return curNode.getValue();
        }

        return peekH(curNode.getNextNode());
    }

    @Override
    public boolean isEmpty() {
        return rootNode == null;
    }

    @Override
    public void clear() {
        rootNode = null;
    }
}
