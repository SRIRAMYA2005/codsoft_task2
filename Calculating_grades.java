import java.util.Scanner;

public class Calculating_grades {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int sub = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= sub; i++) {
            System.out.println("Enter marks for Subject " + i + " (out of 100): ");
            int subMarks = scanner.nextInt();
            totalMarks += subMarks;
        }

        double averagePercentage = (double) totalMarks / sub;
        char grade = calculateGrade(averagePercentage);

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();

        
    }

    
    public static char calculateGrade(double averagePercentage) {
    	if (averagePercentage >= 100) {
    		return 's';
    	}
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
       
    }
    
}