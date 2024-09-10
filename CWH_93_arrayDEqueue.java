package com.company;


import java.util.*;

// Array DEque--> Double Ended que:- you can insert and delete the data from the start and end.
public class CWH_93_arrayDEqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>(0);
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

//        Note: ArrayDeque class implements (Deque interface)
    }
}
