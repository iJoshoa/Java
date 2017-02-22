
import java.util.Scanner;
/**
 *
 * @author $_F
 */
public class maxmin {
    public static void main(String[] args) {
        int[] std=new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Std = ");
            std[i] = sc.nextInt();
        }
        int max=std[0];
        int min=std[0];
        int a=0,b=0;
        for (int i = 0; i < 10; i++) {
            if(max<std[i]){
                max=std[i];
                a=i;
            }            
            if(min>std[i]){
                min=std[i];
                b=i;
            }           
        }
        System.out.println("max = "+max+" std="+(a+1));
        System.out.println("min = "+min+" std="+(b+1));
    }
}
