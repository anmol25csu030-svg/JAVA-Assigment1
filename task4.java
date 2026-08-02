import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.println("Enter Annual Interest Rate : ");
        double rate = sc.nextDouble();

        System.out.println("Enter Time : ");
        double time = sc.nextDouble();

        double simpleInterest = principal * rate * time / 100;
        double finalAmount = principal + simpleInterest;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Final Amount = " + finalAmount);

       
    }
}