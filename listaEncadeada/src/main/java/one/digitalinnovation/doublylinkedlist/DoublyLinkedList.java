package one.digitalinnovation.doublylinkedlist;


public class DoublyLinkedList<T>{
    private DoublyNode<T> firstNodeRef;
    private DoublyNode<T> lastNodeRef;

    private int listSize;

    public DoublyLinkedList() {
        this.firstNodeRef = null;
        this.lastNodeRef = null;
        this.listSize = 0;
    }

    public int size(){
        return listSize;
    }
    public T get(int index){
        return this.getNode(index).getContent();
    }
    private DoublyNode<T> getNode(int index){
        DoublyNode<T> auxNode = firstNodeRef;

        for(int i = 0;(i<index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNode();
        }
        return auxNode;
    }
}