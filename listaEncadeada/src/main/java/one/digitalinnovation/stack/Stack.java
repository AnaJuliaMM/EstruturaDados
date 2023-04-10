package one.digitalinnovation.stack;

import one.digitalinnovation.Node;

public class Stack<T> {
    private Node<T> refEnterStack;

    public Stack() {
        this.refEnterStack = null;//Pilha começa vazia
    }

    public Node<T> push(T value) {
        Node<T> newNode = new Node<>(value);

        Node<T> refAuxiliar = refEnterStack;//guardamos a ref de entrada
        refEnterStack = newNode; //Atribuindo a ref da memoria
        refEnterStack.setNextNodeRef(refAuxiliar);
        return refEnterStack;
    }

    public T pop(){
        //Retira
        if(!this.isEmpty()) {
            Node<T> nodePoped = refEnterStack;
            refEnterStack = refEnterStack.getNextNodeRef();
            return nodePoped.getValue();
        }
        return null;

    }
    public T top() {
        return refEnterStack.getValue();
    }
    public boolean isEmpty(){
        return refEnterStack==null? true:false;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node<T> nodeAuxiliar = refEnterStack;
        while(true){
            if(nodeAuxiliar != null){
                stringReturn +="[Node {dado=" + nodeAuxiliar.getValue()+ "}]\n";
                nodeAuxiliar = nodeAuxiliar.getNextNodeRef();
            }else{
                stringReturn += "null";
                break;
            }
        }
        return stringReturn;
    }
}
