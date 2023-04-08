package one.digitalinnovation.queue;

import one.digitalinnovation.Node;

public class Queue<T> {
    private Node<T> refEnterQueue;

    public Queue() {
        this.refEnterQueue = null; //Primeiro elemento aponta para o nulo
    }
    public boolean isEmpty(){
        return refEnterQueue==null?true:false;
    }
    public void enqueue (T obj){
        Node<T> newNode = new Node<>(obj); //Cria o método aqui
        newNode.setNextNodeRef(refEnterQueue); //Aponta para o último
        refEnterQueue = newNode;
    }
    public T first(){
       //Retorna o primeiro sem tirá-lo da fila
        if(!this.isEmpty()){
            Node<T>  firstNode = refEnterQueue;
            while(true){
                if(firstNode.getNextNodeRef()!=null){
                    firstNode = firstNode.getNextNodeRef();
                }else{
                    break;
                }
            }
            return (T)firstNode.getValue();
        }
        return null;
    }
    public T dequeue(){
        //Retorna o primeiro e tira-o da fila
        if(!this.isEmpty()){
            Node<T>  firstNode = refEnterQueue;
            Node<T>  nodeAuxiliar = refEnterQueue;
            while(true){
                if(firstNode.getNextNodeRef()!=null){
                    nodeAuxiliar = firstNode;
                    firstNode = firstNode.getNextNodeRef();
                }else{
                    nodeAuxiliar.setNextNodeRef(null);
                    break;
                }
            }
            return (T)firstNode.getValue();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node<T>  nodeAuxiliar= refEnterQueue;
        if(refEnterQueue != null){
            while (true){
                stringReturn += "[Node {data=" + nodeAuxiliar.getValue() + "}]---->";
                if(nodeAuxiliar.getNextNodeRef() != null){
                    nodeAuxiliar = nodeAuxiliar.getNextNodeRef();
                }else{
                    stringReturn += "null";
                    break;
                }
            }
        }else{
            stringReturn = "null";
        }
        return stringReturn;
    }
}
