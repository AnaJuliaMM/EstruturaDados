package one.digitalinnovation;


import java.util.Scanner;

import one.digitalinnovation.linkedlist.LinkedList;
import one.digitalinnovation.queue.Queue;
import one.digitalinnovation.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Que estrutura de dados deseja exibir?\n1-Pilha;\n2-Fila\n3-Lista Encadeada");
        int option = in.nextInt();

        System.out.println("\nOpção escolhida: " + option);
        in.nextLine();

        switch(option){
            case 1:
                getStack();
                break;
            case 2:
                getQueue();
                break;
            case 3:
                getLinkedList();
                break;

        }
        in.close();
    }
    public static void getLinkedList(){
        LinkedList<String> myList = new LinkedList<>();

        System.out.println("Minha lista ---------------------------------------------------------------------------------");
        myList.add("Test 0");
        myList.add("Test 1");
        myList.add("Test 2");
        myList.add("Test 3");
        System.out.println(myList);

        System.out.println("\nBuscando nó pelo índice -------------------------------------------------------------------");
        System.out.println("0= " + myList.get(0));
        System.out.println("1= " + myList.get(1));
        System.out.println("2= " + myList.get(2));
        System.out.println("último= " + myList.get(3));

        System.out.println("\nRemovendo ---------------------------------------------------------------------------------");
        System.out.println("\nRemovendo o primeiro item: " + myList.remove(0));
        System.out.println(myList);

        System.out.println("\nRemovendo o primeiro item: " + myList.remove(0));
        System.out.println(myList);

        System.out.println("\nAdicionando e Removendo -------------------------------------------------------------------");
        myList.add("last");
        System.out.println("\nAdicionado nó: " + myList.get(myList.size()-1));
        System.out.println(myList);
        System.out.println("\nRemovido : " + myList.remove(0) );
        System.out.println(myList);
    }
    public static void getQueue(){
        Queue<String> myQueue = new Queue<>();

        myQueue.enqueue("primeiro");
        myQueue.enqueue("segundo");
        myQueue.enqueue("terceiro");
        myQueue.enqueue("quarto");
        myQueue.enqueue("quinto");
        myQueue.enqueue("sexto");

        System.out.println("\n***************** Minha Fila de STRINGS: *******************************************************************\n");
        System.out.println(myQueue);

        System.out.println("\nRetirando o primeiro nó:");
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);

        System.out.println("\nQuem é  o primeiro nó agora?:");
        System.out.println(myQueue.first());
        System.out.println(myQueue);

        System.out.println("\nAdicionado um item a fila:");
        myQueue.enqueue("último");
        System.out.println(myQueue);
    }
    private static void getStack(){
        System.out.println("\n*** Minha Pilha (LIFO):********************************************************************************************");
        
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack);

        System.out.print("\n- Quem é está no topo? ");
        System.out.println(myStack.top());
        System.out.println(myStack);

        System.out.print("\n- Retirando nó: ");
        System.out.println(myStack.pop()); //Remove the last in
        System.out.println(myStack);

        System.out.println("\n- Adicionando nó:");
        myStack.push(100);
        System.out.println(myStack);

        System.out.print("\n- Retirando nó: ");
        System.out.println(myStack.pop()); //Remove the last in
        System.out.println(myStack);

    }

}