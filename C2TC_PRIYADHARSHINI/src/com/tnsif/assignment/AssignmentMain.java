package com.tnsif.assignment;
import com.tnsif.utilities.EmployeeUtilities;
public class AssignmentMain {
 public static void main(String[] args) {
 Manager manager = new Manager("Priya", 114, 100000, "Fullstack Developer");
 Developer developer = new Developer("dharshini", 115, 80000, "Java");
 EmployeeUtilities.printEmployeeDetails(manager);
 EmployeeUtilities.printEmployeeDetails(developer);
 }
}