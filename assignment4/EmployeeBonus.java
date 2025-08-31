public class EmployeeBonus {
    
    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2]; // [salary, yearsOfService]
        
        for (int i = 0; i < count; i++) {
            // Generate 5-digit random salary (10000 to 99999)
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            // Generate random years of service (1 to 15)
            data[i][1] = 1 + (int)(Math.random() * 15);
        }
        
        return data;
    }
    
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] results = new double[employeeData.length][3]; // [oldSalary, newSalary, bonus]
        
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusRate;
            
            if (yearsOfService > 5) {
                bonusRate = 0.05; // 5% bonus
            } else {
                bonusRate = 0.02; // 2% bonus
            }
            
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;
            
            results[i][0] = oldSalary;
            results[i][1] = newSalary;
            results[i][2] = bonus;
        }
        
        return results;
    }
    
    public static void displayResults(double[][] employeeData, double[][] results) {
        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("--------\t----------\t-----\t-----\t\t----------");
        
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.0f\t%.2f\t\t%.2f\n", 
                (i + 1), results[i][0], employeeData[i][1], results[i][2], results[i][1]);
            
            totalOldSalary += results[i][0];
            totalNewSalary += results[i][1];
            totalBonus += results[i][2];
        }
        
        System.out.println("\nSummary:");
        System.out.println("Total Old Salary: " + String.format("%.2f", totalOldSalary));
        System.out.println("Total New Salary: " + String.format("%.2f", totalNewSalary));
        System.out.println("Total Bonus Amount: " + String.format("%.2f", totalBonus));
    }
    
    public static void main(String[] args) {
        System.out.println("Employee Bonus Calculator - Zara Company");
        System.out.println("=======================================");
        
        int employeeCount = 10;
        double[][] employeeData = generateEmployeeData(employeeCount);
        double[][] results = calculateBonusAndNewSalary(employeeData);
        
        System.out.println("Bonus Policy:");
        System.out.println("- 5% bonus for employees with more than 5 years of service");
        System.out.println("- 2% bonus for employees with 5 years or less of service");
        System.out.println();
        
        displayResults(employeeData, results);
    }
}
