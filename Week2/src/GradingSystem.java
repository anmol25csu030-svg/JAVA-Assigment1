 import java.util.Scanner;

    public class GradingSystem {
        public  void grade() {
            Scanner sc = new Scanner(System.in);
             System.out.println("Enter marks:  ");
             int marks =sc.nextInt();

             if((marks>=80) && (marks<=100)){
                System.out.println("Distinction");
             }else if((marks>=70) && (marks<=79)){
                System.out.println("Merit");
             }else if((marks>=50) && (marks<=69)){
                System.out.println("Pass");
             }else{
                System.out.println("Fail");
             }
        }}