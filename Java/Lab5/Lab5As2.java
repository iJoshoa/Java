
/**
 *
 * @author $_F
 */
/*
2. ให้นักศึกษาออกแบบคลาสรถยนต์ และเขียนโปรแกรม โดยรถยนต์มี Instance และ Method ดังนี้
- v (ความเร็ว)
- s (ตำแหน่ง)
- Brand (ยี่ห้อรถ)
+ เร่งความเร็ว จะทำให้ความเร็วรถเพิ่มขึ้น โดยให้เพิ่มขึ้นทีละ 1 ตำแหน่งจะเปลี่ยนตามความเร็วรถ
+ เบรก จะทำให้ความเร็วรถลดลง โดยให้ลดลงทีละ 1
> ตอนเริ่มต้นรถทุกคันจะมีความเร็ว = 1
> ตอนเริ่มต้นรถทุกคันจะมีตำแหน่ง = 0
ให้ออกแบบคลาส โดยคลาสมีคุณสมบัติ Encapsulation คือมีฟังก์ชัน get และ set ด้วย
จากนั้นสร้าง Object Car ขึ้นมาโดยใช้ Array ขนาด 5 และมีการเร่งความเร็ว หรือเบรก อย่างน้อย 10 ครั้ง ในการสั่ง
คำสั่งแต่ละครั้ง ให้มีการแสดงยี่ห้อรถ ความเร็ว และตำแหน่ง ด้วย
*/
import java.util.Scanner;

class car{
    private int v;
    private String Brand;
    public int s;
    
    car(String Brand){
        this.Brand=Brand;
        this.v=1;
        this.s=0;
    }
    
    public void setBrand(String Brand){
        this.Brand=Brand;
    }
    public String getBrand(){
        return Brand;
    }
    public void setV(int v){
        this.v=v;
    }
    public int getV(){
        return v;
    }
    public void setS(int s){
        this.s=s;
    }
    public int getS(){
        return s;
    }
    public void speed(){
        //System.out.println("Speed");
        this.v+=1;
        this.s+=1;
        checkCar();
    }
    public void Break(){
        //System.out.println("Break");
        this.v-=1;
        this.s-=1;
        checkCar();
    }
    public void checkCar(){
        System.out.print("Name = "+this.Brand+" Speed = "+this.v);
        System.out.println(" S = "+this.getS());
        //System.out.println("--------------");
    }
}
public class Lab5As2 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter Num : ");
        //int num = sc.nextInt();
        int num = 5;
        car[] a= new car[num];
        for (int i = 0; i < num; i++) {
            a[i]=new car("Car"+(i+1));
            System.out.println("Name : "+a[i].getBrand()+" Speed : "+a[i].getV());
        }
        System.out.println("------------------");
        for (int i = 0; i < 3; i++) {
            a[1].speed();
            a[3].speed();
            a[3].speed();
            
        }
        a[3].Break();
        a[3].Break();
        a[3].Break();
    }
}
