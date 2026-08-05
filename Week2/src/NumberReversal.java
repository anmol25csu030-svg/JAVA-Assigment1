
import java.util.Scanner;
public class NumberReversal {
    public void reverse (){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number digit : ");
        int num = sc.nextInt();

        int reverse =0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }
        System.out.print("reverse digit is : " +reverse);
    }
    
}
