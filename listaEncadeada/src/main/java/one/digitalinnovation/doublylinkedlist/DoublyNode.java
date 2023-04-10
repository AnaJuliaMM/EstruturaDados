package one.digitalinnovation.doublylinkedlist;

public class DoublyNode<T>{
    private T content;
    private DoublyNode<T> nextNode;
    private DoublyNode<T> previousNode;

    public DoublyNode(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public one.digitalinnovation.doublylinkedlist.DoublyNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(one.digitalinnovation.doublylinkedlist.DoublyNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public one.digitalinnovation.doublylinkedlist.DoublyNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(one.digitalinnovation.doublylinkedlist.DoublyNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "DoublyNode{" +
                "content=" + content +
                '}';
    }
}