public class LoopPatterns{
    public  void pattern() {

        // Pattern A 
        System.out.println("Pattern A for size 4:");

        for(int i = 1 ;i<=4 ;i++){
            for(int j =1 ; j<=4 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pattern B
        System.out.println("Pattern B for size 4:");

        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern C
        System.out.println("Pattern C for size 4:");

        for(int i = 1 ;i<=4 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j );
            }
            System.out.println();
        }
        
        // pattern d 

        System.out.println("Pattern D for size 4:");
        for (int i = 1 ;i<=4 ; i++){
            for(int j=4 ; j>=i ;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // pattern e 
        System.out.println("Pattern C for size 4:");

        for(int i = 1 ;i<=4 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i );
            }
            System.out.println();
        }
    }
}