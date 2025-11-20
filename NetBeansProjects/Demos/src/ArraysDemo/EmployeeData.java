/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysDemo;

/**
 *
 * @author seany
 */
public class EmployeeData {
    public static void main(String[] args) {

        String[][] employees = {
            {"John Doe", "1001", "Software Engineer", "75000"},
            {"Jane Smith", "1002", "HR Manager", "65000"},
            {"Bob Johnson", "1003", "Accountant", "58000"}
        };


        System.out.println("Employee Details:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Name: " + employees[i][0]);
            System.out.println("ID: " + employees[i][1]);
            System.out.println("Position: " + employees[i][2]);
            System.out.println("Salary: $" + employees[i][3]);
            System.out.println();
        }
    }
}
