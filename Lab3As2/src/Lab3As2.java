/*
2. ให้นักศึกษาเขียนโปรแกรมรับตัวเลขมา 1 ค่าตรวจสอบว่ามีค่านั้นเป็นจำนวนเฉพาะหรือไม่ ถ้าใช่ให้แสดงค่าจำนวน
เฉพาะตั้งแต่ 2 จนถึงค่าที่รับเข้ามา
*/
import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class Lab3As2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        int num = sc.nextInt();
        int a=0;       
        for (int i = 2; i <= num; i++) {
            for (int j=2; j <=i; j++) {
                if(j==i){
                    a=i;
                }                   
                if(i%j==0)break;                   
            }
        }
        if(a==num){
            for (int i = 2; i <= num; i++) {
                for (int j=2; j <=i; j++) {
                    if(j==i) System.out.print(i+" ");                   
                    if(i%j==0)break;                   
                }
            }
        }
        else{
            System.out.println("Number not Prime");
        }
    }
}

