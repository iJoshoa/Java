
import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class Starloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
                 *
                **
               ***
              ****
             *****
        */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
           *****
            ****
             ***
              **
               *
        */
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            *****
            ****
            ***
            **
            *
        */
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            *
            **
            ***
            ****
            *****
        */
    }
}
