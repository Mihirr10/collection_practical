package com.collectionpractical.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Employee {
  Map<String, String> employee = new TreeMap<>();

  public Map<String, String> getEmployee() {
    employee.put("Mihir", "Java");
    employee.put("Abhi", "Dot net");
    employee.put("Parth", "Flutter");
    return employee;
  }

  public void employeeDetails() {
    for (Map.Entry employee : employee.entrySet()) {
      System.out.println("\nEmployeeName: " + employee.getKey() + " \nEmployee Department: " + employee.getValue());
    }
  }
}

