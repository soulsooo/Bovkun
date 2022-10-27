//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package employees;

public class Manager extends Employee {
    public Manager(String name, double ratePerMonth) {
        this.id = this.createId();
        this.name = name;
        this.position = "manager";
        this.salary = this.salaryCalculation(ratePerMonth);
        employees.add(this);
    }

    public double salaryCalculation(double ratePerMonth) {
        return ratePerMonth;
    }
}
