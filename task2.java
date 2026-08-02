import java.util.Scanner;
public class  task2{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter first no.");
int a = sc.nextInt();

System.out.println("Enter first no.");
int b = sc.nextInt();

System.out.println("sum is : " + (a+b));
System.out.println("diff. is : " + (a-b));
System.out.println("product is : " + (a*b));
System.out.println("division is : " + (a/b));
System.out.println("remainder is : " + (a%b));
}
}