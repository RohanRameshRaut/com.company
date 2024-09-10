package com.company;

import java.util.*;

public class CWH_91_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(); //integer type (like template class)
        ArrayList<Integer> l2 = new ArrayList<>(5); // 5 is obviously constructor argument/value
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5); //add(index, element).
        l1.add(0, 1); //add(index, element).
        l1.addAll(0, l2); //add all elements of l2 ArrayList, by default it will append them, or you can specify the index position.
        l1.set(1, 566); // will set the value at position set(index, position).
        for(int i=0;i<l1.size();i++){ //.size() method will return the size of the Arraylist
            System.out.print(l1.get(i)); // l1.get() method is used to get the elements of ArrayList
            System.out.print(", ");
        }
//        System.out.println(l1.contains(7));
//        System.out.println(l1.indexOf(159)); // returns the index of the number else return -1.
//        System.out.println(l1.indexOf(6)); // return 1st index
//        System.out.println(l1.lastIndexOf(6)); // return last index

    }
}
