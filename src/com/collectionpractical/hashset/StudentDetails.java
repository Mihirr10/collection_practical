package com.collectionpractical.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class StudentDetails {
  Set<Integer> hashSet = new HashSet<>();
  Iterator<Integer> itr = hashSet.iterator();

  public Set<Integer> add() {

    hashSet.add(12);
    hashSet.add(11);
    hashSet.add(14);
    return hashSet;
  }

  public void studentDetails() {
    for (Integer rollno : hashSet) {
      System.out.println("Student roll no:" + rollno);
    }
  }
}
