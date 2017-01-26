/**
 *
 * @author $_F
 */
/*
2. ให้นักศึกษาออกแบบคลาสรถยนต์ และเขียนโปรแกรม โดยรถยนต์มี Instance และ Method ดังนี้
- v (ความเร็ว)
- Brand (ยี่ห้อรถ)
+ เร่งความเร็ว จะทำให้ความเร็วรถเพิ่มขึ้น โดยให้เพิ่มขึ้นทีละ 1
+ เบรก จะทำให้ความเร็วรถลดลง โดยให้ลดลงทีละ 1
> ตอนเริ่มต้นรถทุกคันจะมีความเร็ว = 1
> ตอนเริ่มต้นรถทุกคันจะมีตำแหน่ง = 0
ให้ออกแบบคลาส โดยคลาสมีคุณสมบัติ Encapsulation คือมีฟังก์ชัน get และ set ด้วย
จากนั้นสร้าง Object Car มาอย่างน้อย 3 Objects และมีการเร่งความเร็ว หรือเบรก อย่างน้อย 10 ครั้ง ในการสั่งคำ
สั่งแต่ละครั้ง ให้มีการแสดงยี่ห้อรถ ความเร็ว ด้วย
*/
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
        System.out.println("Name = "+this.Brand+" Speed = "+this.v);
        //System.out.println(" S = "+this.getS());
        //System.out.println("--------------");
    }
}
public class Lab4As2 {
    public static void main(String[] args) {
        car a= new car("lambo");
        car b= new car("porche");
        car c= new car("f1");
        System.out.println("Name : "+a.getBrand()+" Speed : "+a.getV());
        System.out.println("Name : "+b.getBrand()+" Speed : "+b.getV());
        System.out.println("Name : "+c.getBrand()+" Speed : "+c.getV());
        System.out.println("--------------");
        //a.setS(30);
        a.speed();
        a.speed();
        a.Break();
        b.speed();
        b.speed();
        b.Break();
        b.speed();
        c.speed();
        c.speed();
        c.speed();
    }
}
