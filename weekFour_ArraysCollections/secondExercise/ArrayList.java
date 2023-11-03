package weekFour_ArraysCollections.secondExercise;

import java.util.Comparator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> listNames = new java.util.ArrayList<>();


        //Add some names to the list.
        listNames.add("Carlos");
        listNames.add("Eduardo");
        listNames.add("Caroline");
        listNames.add("Alice");
        listNames.add("Graça");


        //Print the complete list on screen.
        System.out.println("1 - Print the complete list on screen.");
        System.out.println(listNames);
        System.out.println("-----------------------------------------");

        //Check if a specific name is present in the list.
        boolean exist = listNames.contains("Caroline");

        if (exist){
            System.out.println("2 - Name Caroline is on the list");
            System.out.println("----------------------------------------------");
        }

        //Remove a name from the list.
        listNames.remove(3);

        //Print the list again to show the change.
        System.out.println("3 - Print the list again to show the change.");
        System.out.println(listNames);
        System.out.println("-----------------------------------------");

        //Sort the list alphabetically.
        listNames.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });

        //Print the ordered list.
        System.out.println("4 - Print the ordered list.");
        System.out.println(listNames);
        System.out.println("--------------------------------------");

        //Create a sublist containing just some of the names.
        listNames.subList(0, listNames.size()-2);

        //Print the sublist.
        System.out.println("5 - Print the sublist.");
        System.out.println(listNames.subList(1, 3));
        System.out.println("------------------------------------");

        //Clean the list by removing all elements.
        listNames.removeAll(listNames);

        //Print the empty list to confirm.
        System.out.println("6 - Print the empty list to confirm.");
        System.out.println(listNames);
    }
}
