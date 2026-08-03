import java.util.Scanner;
public class task5{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input value");
        int value = sc.nextInt();
        
        int hundreds = value/100;
        System.out.println("Hundreds : " + hundreds);

        int tens = (value%100)/10;
        System.out.println("tens : " +tens);

        int ones = value%10;
        System.out.println("ones : " +ones);


    }
}