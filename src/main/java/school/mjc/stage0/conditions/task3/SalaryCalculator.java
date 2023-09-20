package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            double taxRate = 0.15;
            double taxedSalary = salary - (salary * taxRate);
            System.out.println("Salary after taxes: " + taxedSalary);
        } else if (salary <= 20000) {
            double taxRate = 0.18;
            double taxedSalary = salary - (salary * taxRate);
            System.out.println("Salary after taxes: " + taxedSalary);
        } else {
            double taxRate = 0.20;
            double taxedSalary = salary - (salary * taxRate);
            System.out.println("Salary after taxes: " + taxedSalary);
        }
    }

  
}

