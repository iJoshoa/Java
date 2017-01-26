
import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class tClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        int num = sc.nextInt();
        if (num%2==0 || num%3==0|| num%5==0 || num%7==0 || num%11==0) {
            System.out.println("Number not Prime");
        }
        else{
            System.out.println("Number "+num+" is Prime");
            for (int i = 2; i <= num; i++) {
                for (int j=2; j <=i; j++) {
                    if(j==i){
                        System.out.print(i+" ");
                    }
                    if(i%j==0){
                       break;
                    }
                }
            }
        }
    }
}
