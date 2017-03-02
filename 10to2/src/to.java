
import java.util.Scanner;


/**
 *
 * @author $_F
 */
public class to {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.print("input = ");
        num=sc.nextInt();
        int[] digi = {128,64,32,16,8,4,2,1};
        for (int i = 0; i < digi.length; i++) {
            if(num<digi[i]){ 
                digi[i]=0;
                System.out.print(digi[i]+" ");
            }
            else{
                num-=digi[i];
                System.out.print(digi[i]+" ");
                digi[i]=1;
            } 
        }
        System.out.println("");
        for (int i = 0; i < digi.length; i++) {
            System.out.print(digi[i]);
        }
        System.out.println("");
    }
}
