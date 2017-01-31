
import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class tClass {
    public static void main(String[] args) {
          int  n,a=0 ;
       Scanner S = new Scanner(System.in);
       System.out.println("input");
       n=S.nextInt();
        
       if(n==2){
             System.out.println("2");
         }
         if(n==3){
             System.out.println("2,3");
         }
         if(n==5){
                 System.out.println("2,3,5");
        }
        if(n==7){
                 System.out.println("2,3,5,7");
        }
         if(n==11){
                  System.out.println("2,3,5,7,11");
        }
         else{
             if(n>=2);
                for ( int i = 2; i<=n; i++){                       
                 if ( i%2==0|| i%3==0 || i%5==0 || i%7==0 || i%11==0 ){
                       //System.out.println("sum "+i);
                         
                     }
                 else 
                      {
                       System.out.print(" "+i);             
                     }      
                 }
                     
         }
    }
}
