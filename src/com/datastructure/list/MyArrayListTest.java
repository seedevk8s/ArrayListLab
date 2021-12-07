package com.datastructure.list;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        IList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.insert(2,4);

        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(3));

        myArrayList.delete(1);
        myArrayList.deleteByIndex(1);

        //myArrayList.clear();
        //myArrayList.add(100);
        System.out.println(myArrayList.get(0));



    }
}
