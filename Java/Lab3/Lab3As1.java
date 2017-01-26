/*
1. ให้นักศึกษาเขียนโปรแกรมแสดงผลรูปต่อไปนี้ เมื่อรับค่า n ตามค่าต่าง ๆ ต่อไปนี้
n=3
*+*
 *+
  *
n=5
*+*+*
 *+*+
  *+*
   *+
    *

*/
import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class Lab3As1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < n-i; j++) {
                if(j%2==0){
                    System.out.print("*");                    
                }
                else System.out.print("+");
            }
            
            System.out.println("");
        }
    }
}
