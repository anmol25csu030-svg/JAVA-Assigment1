import java.util.Scanner;
public class MenuCalculator 
{
    public void Calculate() 
    {
        int choice = 0;
        do
        {
            System.out.println("1-Addition");
            System.out.println("2-Subtraction");
            System.out.println("3-multiply");
            System.out.println("4-divide ");
            System.out.println("0-exit");
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            if(choice != 0)
            {
                System.out.print("Enter a  value : ");
                int a = sc.nextInt();

                System.out.print("Enter b value : ");
                int b = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("addition : " + (a+b));
                    break;

                    case 2:
                        System.out.println("subtraction : " +(a-b));
                        break;

                    case 3:
                        System.out.println("multiply : " + (a*b));
                        break;
                        
                    case 4 :
                        System.out.println("divide : " +(a/b));
                        break; 
                    default :
                    System.out.println("invalid choices");       
                }
            }
        }while(choice != 0);
        System.out.println("System end");
        
    }
}
