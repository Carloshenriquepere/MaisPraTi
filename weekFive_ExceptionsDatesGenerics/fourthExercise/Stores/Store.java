package weekFive_ExceptionsDatesGenerics.fourthExercise.Stores;

import java.util.HashSet;
import java.util.Set;

public class Store<T, V>{

    private Set<T> itemList = new HashSet<>();
    private Set<V> valueItem = new HashSet<>();


    public void insertItem(T item, V value){
        valueItem.add(value);
        itemList.add(item);
    }

    public Set<T> showItem(){
        for (T item : itemList){
            System.out.println(item);
        }
        return itemList;
    }
    public Set<V> showValue(){
        for (V value : valueItem){
            System.out.println(value);
        }
        return valueItem;
    }

    public String getLastClassNamePart() {
        String fullClassName = getClass().getName();
        int lastDotIndex = fullClassName.lastIndexOf('.');
        if (lastDotIndex != -1) {
            return fullClassName.substring(lastDotIndex + 1);
        } else {
            return fullClassName;
        }
    }

    @Override
    public String toString() {
        return "Store: " + getLastClassNamePart()+
                "\nItem List= " + itemList +
                ",\nValue Item= " + valueItem;
    }
}
