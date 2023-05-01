package com.collectionpractical;

import com.collectionpractical.arraylist.Student;
import com.collectionpractical.hashmap.Player;
import com.collectionpractical.hashset.StudentDetails;
import com.collectionpractical.treemap.Employee;
import com.collectionpractical.treeset.Department;


public class Main {
  public static void main(String[] args) {

    Student student = new Student();
    System.out.println("\nArrayList:");
    student.add();
    student.display();
    
    Player player = new Player();
    System.out.println("\nHash Map:");
    player.add();
    player.display();

    StudentDetails studentDetails = new StudentDetails();
    System.out.println("\nHash set:");
    studentDetails.add();
    studentDetails.studentDetails();

    Department department = new Department();
    System.out.println("\nTree Set:");
    department.getDepartment();
    department.departmentDetails();

    Employee employee = new Employee();
    System.out.println("\nTree Map:");
    employee.getEmployee();
    employee.employeeDetails();

  }
}