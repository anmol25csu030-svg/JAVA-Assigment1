import java.util.Scanner;

public class MarksProcessor {
    public  void marks() {

        Scanner sc = new Scanner(System.in);

        int marks;
        int validMarks = 0;
        int pass = 0;
        int fail = 0;
        int sum = 0;
        int highest = 0;

        while (true) {

            System.out.print("Enter marks (-1 to close the program): ");
            marks = sc.nextInt();

           
            if (marks == -1) {
                System.out.println("Program Ended!");
                break;
            }

            
            if (marks >= 0 && marks <= 100) {

                validMarks++;
                sum += marks;

                
                if (marks > highest) {
                    highest = marks;
                }

                
                if (marks >= 50) {
                    pass++;
                } else {
                    fail++;
                }

            } else {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
            }
        }

       
        if (validMarks > 0) {

            double average = (double) sum / validMarks;

          
            System.out.println("Valid Marks : " + validMarks);
            System.out.println("Sum         : " + sum);
            System.out.println("Average     : " + average);
            System.out.println("Highest     : " + highest);
            System.out.println("Passes      : " + pass);
            System.out.println("Failures    : " + fail);

        } 

        
}
}