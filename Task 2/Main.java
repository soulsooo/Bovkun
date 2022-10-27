//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import employees.Employee;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Employee.readFile("employees.csv");
        ArrayList<Employee> employees = Employee.list();
        System.out.println(employees);
        Employee.sortedList();
        System.out.println(employees);

        int i;
        for(i = 0; i < 6; ++i) {
            System.out.println(((Employee)employees.get(i)).getName());
        }

        System.out.println("----");
        Collections.reverse(employees);

        for(i = 0; i < 3; ++i) {
            System.out.println(((Employee)employees.get(i)).getId());
        }

        Employee.writeFile("employees.txt");
    }
}
