package com.collectionpractical.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Department {
  Set<String> department = new TreeSet<>();

  public Set<String> getDepartment() {
    department.add("Java");
    department.add("Python");
    department.add("Dot net");
    return department;
  }

  public void departmentDetails() {

    for (String employee : department) {
      System.out.println("Department:" + employee);
    }
  }

}

