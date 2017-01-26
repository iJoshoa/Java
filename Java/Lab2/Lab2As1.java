
import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class Lab2As1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        String x;
        System.out.print("Input 1 : ");
        a = sc.nextFloat();
        System.out.print("Operator : ");
        x = sc.next();
        System.out.print("Input 2 : ");
        b = sc.nextFloat();
        switch(x){
            case "+" :  System.out.println("Results : "+(a+b)); break;
            case "-" :  System.out.println("Results : "+(a-b)); break;
            case "*" :  System.out.println("Results : "+(a*b)); break;
            case "/" :  System.out.println("Results : "+(a/b)); break;
            default : System.out.println("Try again");
        }
    }
}
