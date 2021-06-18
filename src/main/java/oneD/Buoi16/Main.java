package oneD.Buoi16;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product pro = new Product();
        ArrayList<Product> products = pro.addProduct();
        pro.searchProduct(products, "Sữa");
        pro.deleteProduct(products, 222);

        Employee employee = new Employee();
        ArrayList<Employee> employees = employee.addEmployee();
        employee.updateEmployee(employees);
        employee.removeEmployee(employees);
    }
}