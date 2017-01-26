
import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class Lab2As2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,d,e;
        System.out.print("Input 1 : ");
        a = sc.nextFloat();
        System.out.print("Input 2 : ");
        b = sc.nextFloat();
        System.out.print("Input 3 : ");
        c = sc.nextFloat();
        System.out.print("Input 4 : ");
        d = sc.nextFloat();
        System.out.print("Input 5 : ");
        e = sc.nextFloat();
        float max=a,min=a;
        if (b > max) max = b; 
	if (c > max) max = c;       
        if (d > max) max = d;     
        if (e > max) max = e;
      
        if (b < min) min = b; 	
	if (c < min) min = c;       
        if (d < min) min = d;        
        if (e < min) min = e;
                               
        System.out.println(max+" is maximum, "+min+" is minimum, average is "+((a+b+c+d+e)/5));

    }
}