package lab5;

public class Node<T> {
    private Node<T> nextNode;
    private T value;

    public Node(T value){
        nextNode = null;
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
