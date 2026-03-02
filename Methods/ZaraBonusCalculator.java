
import java.util.*;

public class ZaraBonusCalculator {
    public static double[][] generateSalaryAndService(int employeeCount) {
        double[][] data = new double[employeeCount][2];
        for (int i = 0; i < employeeCount; i++) {
            int salary = 10000 + (int) (Math.random() * 90000);
            int years = 1 + (int) (Math.random() * 10);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] oldData) {
        double[][] newData = new double[oldData.length][2]; // [bonus, newSalary]
        for (int i = 0; i < oldData.length; i++) {
            double salary = oldData[i][0];
            double years = oldData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            newData[i][0] = bonus;
            newData[i][1] = newSalary;
        }
        return newData;
    }

    public static void displayReport(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            int years = (int) oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            System.out.printf("%d\t%.2f\t%d\t%.2f\t%.2f\n",
                    i + 1, oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("\nTotal Old Salary: ₹" + Math.round(totalOldSalary));
        System.out.println("Total Bonus Paid: ₹" + Math.round(totalBonus));
        System.out.println("Total New Salary: ₹" + Math.round(totalNewSalary));
    }

    public static void main(String[] args) {
        int employeeCount = 10;
        double[][] salaryAndService = generateSalaryAndService(employeeCount);
        double[][] bonusAndNewSalary = calculateBonusAndNewSalary(salaryAndService);
        displayReport(salaryAndService, bonusAndNewSalary);
    }
}