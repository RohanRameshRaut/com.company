package com.company;

import java.util.*;
// ArrayList and linkedList methods are same but internal working is different, linkedList has some advanced methods or more methods than arrayList.
public class CWH_92_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(); //integer type (like template class)
        LinkedList<Integer> l2 = new LinkedList<>(); // 5 is obviously constructor argument/value
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5); //add(index, element).
        l1.add(0, 1); //add(index, element).
        l1.addAll(0, l2);
        l1.addLast(53);
        l1.addFirst(35);
        l1.set(1, 566);

        for(int i=0;i<l1.size();i++){ //.size() method will return the size of the Arraylist
            System.out.print(l1.get(i)); // l1.get() method is used to get the elements of ArrayList
            System.out.print(", ");
        }
    }
}
