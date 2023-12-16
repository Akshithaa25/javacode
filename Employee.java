import java.util.Date;

class Employee {
    private String name;
    private Date hireDate;

    public Employee(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String toString() {
        return "Employee: [name= " + name + ", hireDate= " + hireDate + "]";
    }
}

class RegularEmployee extends Employee {
    private double annualSalary;
    private double bonusPercentage;

    public RegularEmployee(String name, Date hireDate, double annualSalary, double bonusPercentage) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
        this.bonusPercentage = bonusPercentage;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public double calculateBonusAmount() {
        return annualSalary * bonusPercentage / 100.0;
    }

    public String toString() {
        return super.toString() + "\n" + "Regular Employee: [annualSalary= " + annualSalary + ", bonusPercentage= " + bonusPercentage + ", bonusAmount= " + calculateBonusAmount() + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new RegularEmployee("Smith W", new Date(), 120000, 10);
        System.out.println(emp);
    }
}
