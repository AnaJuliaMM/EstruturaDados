package one.digitalinnovation;

import one.digitalinnovation.LinkedList;

public class Main {
    public static void main(String[] args) {
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

}