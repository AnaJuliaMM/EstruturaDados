package one.digitalinnovation;

public class LinkedList<T> {
    private Node<T> enterRef;

    public LinkedList(){
        this.enterRef = null;
    }
    public boolean isEmpty(){
        return enterRef==null?true:false;
    }
    public int size(){
        int sizeList = 0;
        Node<T> auxiliarRef = enterRef;
        while(true){
            if(auxiliarRef!=null){
                sizeList++;
                if(auxiliarRef.getNextNodeRef()!=null){
                    auxiliarRef = auxiliarRef.getNextNodeRef();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return sizeList;
    }
    public void add (T value){
        Node<T> newNode =  new Node<>(value);

        if(this.isEmpty()){
            enterRef = newNode;
            return;
        }

        Node<T> auxNode = enterRef;
        for(int i = 0; i< this.size()-1; i++){
            auxNode = auxNode.getNextNodeRef();
        }
        auxNode.setNextNodeRef(newNode);
    }
    private void validateIndex(int index){
        if(index>= this.size()){
            int lastItem = this.size()-1;
            throw new IndexOutOfBoundsException("Não há conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + lastItem + ".");
        }
    }
    private Node<T> getNode(int index){
        validateIndex(index);
        Node<T> auxNode = enterRef;
        Node<T> returnNode = null;


        for(int i = 0; i <= index; i++){
            returnNode = auxNode; //O primeiro é para quem a referencia de entrada aponta. Aqui definimos isso
            auxNode = auxNode.getNextNodeRef();
        }
        return returnNode;
    }
    public T get(int index){
        return getNode(index).getValue();
    }
    public T remove(int index){
        //Retorna o conteudo do nó removido
        Node<T> removeNode = this.getNode(index);
        if(index==0){
            enterRef = removeNode.getNextNodeRef();
            return  removeNode.getValue();
        }
        Node<T> predecessorNode = getNode(index-1);
        predecessorNode.setNextNodeRef(removeNode.getNextNodeRef());
        return  removeNode.getValue();
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> auxiliarNode = enterRef;
        for(int i = 0; i < this.size(); i++){
            returnString += "Node{content= " + auxiliarNode.getValue() + "}--->\n";
            auxiliarNode = auxiliarNode.getNextNodeRef();
        }
        returnString += "null";
        return returnString;
    }
}
