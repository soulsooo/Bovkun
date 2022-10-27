//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package employees;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Employee {
    private static int id_counter;
    protected int id;
    protected String position;
    protected String name;
    protected double salary;
    protected static final ArrayList<Employee> employees = new ArrayList();

    public Employee() {
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public abstract double salaryCalculation(double var1);

    protected int createId() {
        return ++id_counter;
    }

    public String toString() {
        return String.format("{Id: %s, name: %s, position: %s, salary: %s}", this.id, this.name, this.position, this.salary);
    }

    public static ArrayList<Employee> list() {
        return employees;
    }

    public static void sortedList() {
        employees.sort((o1, o2) -> {
            return o1.getSalary() != o2.getSalary() ? Double.compare(o2.getSalary(), o1.getSalary()) : o1.name.compareTo(o2.name);
        });
    }

    public static void writeFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        Iterator var2 = employees.iterator();

        while(var2.hasNext()) {
            Employee i = (Employee)var2.next();
            writer.append(String.format("%s,%s,%s,%s", i.id, i.name, i.position, i.salary));
            writer.append("\n");
        }
