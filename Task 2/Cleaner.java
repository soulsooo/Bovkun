//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package employees;

public class Cleaner extends Employee {
    public Cleaner(String name, double ratePerHour) {
        this.id = this.createId();
        this.name = name;
        this.position = "cleaner";
        this.salary = this.salaryCalculation(ratePerHour);
        employees.add(this);
    }

    public double salaryCalculation(double ratePerHour) {
        return 166.4 * ratePerHour;
    }
}
