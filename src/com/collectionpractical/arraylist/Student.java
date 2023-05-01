package com.collectionpractical.arraylist;


import java.util.ArrayList;
import java.util.Iterator;

public class Student {
  ArrayList<String> list = new ArrayList<>();

  public ArrayList<String> add() {
    list.add("Mihir");
    list.add("Yashraj");
    list.add("Yuvraj");
    return list;
  }

  public void display() {
    Iterator itr = list.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }

}