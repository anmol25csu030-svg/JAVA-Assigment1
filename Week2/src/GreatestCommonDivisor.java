public class GreatestCommonDivisor{
    public  void gcd() {
         int a = 12;
         int b =18;

         while(b!=0){
            int temp = b ;
            b=a%b;
            a=temp;
         }
         System.out.println("Gcd : " +a);
    }
}