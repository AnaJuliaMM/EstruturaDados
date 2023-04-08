package one.digitalinnovation;

public class Node<T> {
        private T value;
        private Node<T> nextNodeRef;

        public Node(){
            this.nextNodeRef = null;
        }
        public Node(T value){
            this.value = value;
            this.nextNodeRef = null;
        }
        public Node(T value, one.digitalinnovation.Node nextNodeRef){
            this.value = value;
            this.nextNodeRef = nextNodeRef;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public one.digitalinnovation.Node getNextNodeRef() {
            return nextNodeRef;
        }

        public void setNextNodeRef(one.digitalinnovation.Node nextNodeRef) {
            this.nextNodeRef = nextNodeRef;
        }
        @Override
        public String toString() {
            return "Node{content= " + this.value + "}";
        }

        public String linkedToString(){
            String str = "Node{" +
                    "content=" + this.value + '}';
            if(nextNodeRef!=null){
                str += "->" + nextNodeRef.toString();
            }else{
                str += "->null";
            }
            return str;
        }

}
