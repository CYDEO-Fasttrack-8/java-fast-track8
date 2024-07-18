package m09_arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> groceriesList = new ArrayList<>();

        System.out.println(groceriesList);

        // add(object): appends the specific element to the end of a list.
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);


        // add(index, object): inserts the specific element at a specific position index in the list.
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);


        // size(): Returns the number of elements in list.
        System.out.println(groceriesList.size());


        // get(index): Returns the element at the given index.
        String firstElement = groceriesList.get(0);
        System.out.println("firstElement = " + firstElement);
        String lastElement = groceriesList.get( groceriesList.size() -1 );
        System.out.println("lastElement = " + lastElement);


        // set(index, object): Replaces the element at the given index with the given element.
        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);


        // remove(int): Removes/Returns value at given index.
        groceriesList.remove(1);
        System.out.println(groceriesList);


        // remove(Object): Removes the first occurrence of the specified element from this list, if it is present.
        groceriesList.remove("Eggs");
        System.out.println(groceriesList);


        // indexOf(object): Returns the index the first occurrence of a specific element.
        System.out.println( groceriesList.indexOf("Oranges") );


        // lastIndexOf(object): Returns the index in this list of the last occurrence of the specified element.
        System.out.println( groceriesList.indexOf("Apples"));
        groceriesList.add("Apples");
        System.out.println(groceriesList);
        System.out.println( groceriesList.lastIndexOf("Apples"));


        // contains(object): Returns true if this list contains the specified element.
        System.out.println( groceriesList.contains("Cooking Oil") );
        System.out.println(groceriesList.contains("Milk"));


        // isEmpty(): Returns true if this list contains no elements.
        System.out.println( groceriesList.isEmpty() );


        // clear(): Removes all elements of the list.
        // groceriesList.clear();
        System.out.println(groceriesList);
        System.out.println(groceriesList.isEmpty());


        // removeIf(Predicate): It is used to remove all the elements from the list that satisfies the given predicate.

        System.out.println(groceriesList);

        groceriesList.removeIf( p -> p.startsWith("A") );

        System.out.println(groceriesList);
    }
}
