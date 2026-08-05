import java.util.Scanner;
public class LeapYear{
    public void leapY(){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the year : ");
        int years = sc.nextInt();

        if((years%400==0) ||( (years%4==0) && (years%100 !=0))){
            System.out.println(years + " is a leap year ");
        }else{
            System.out.println(years + " is not a leap year ");
        }

    }
}