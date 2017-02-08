/**
 *
 * @author $_F
 */
/*
1. ให้นักศึกษาออกแบบคลาสตัวละคร RPG และเขียนโปรแกรม โดยให้ออกแบบอาชีพ knight ซึ่งมี Instance และ
Method ดังต่อไปนี้
- HP (พลังชีวิต)
- MP (พลังเวทย์)
- Atk (พลังโจมตี)
- Def (พลังป้องกัน)
- Name (ชื่อตัวละคร)
+ โจมตี (เป้าหมาย) โดยการโจมตีจะต้องมีการคำนวณค่า Atk ของเรา และ HP, Def ของศัตรู
+ ท่าพิเศษ (เป้าหมาย) โดยท่าพิเศษจะต้องมีการคำนวณค่า Atk และ MP ของเรา และ HP, Def ของศัตรู
ให้แสดงว่าชื่อละครที่โจมตีและแสดงตัวละครของเป้าหมายที่ถูกโจมตี และเป้าหมายเหลือ HP อยู่เท่าใดหลังการโจมตี
โดยให้ออกแบบคลาส ให้คลาสมีคุณสมบัติ Encapsulation (การห่อหุ้ม) คือมีฟังก์ชัน get และ set ด้วย
จากนั้นให้สร้าง Object knight ขึ้นมาโดยใช้ Array ขนาด 5 และมีการใช้ฟังก์ชันโจมตี หรือท่าพิเศษ อย่างน้อย 10
ครั้ง
*/
class Knight{
    private int Hp;
    private int Mp;
    private int Atk;
    private int Def;
    private String Name;
    Knight(String Name,int Hp,int Mp,int Atk,int Def){
        this.Name=Name;
        this.Hp=Hp;
        this.Mp=Mp;
        this.Atk=Atk;
        this.Def=Def;
    }
    Knight(){
        this.Hp=1000;
        this.Mp=1000;
        this.Atk=100;
        this.Def=50;
    }
    public int getHp() {
        return Hp;
    }
    public void setHp(int Hp) {
        this.Hp = Hp;
    }
    public int getMp() {
        return Mp;
    }
    public void setMp(int Mp) {
        this.Mp = Mp;
    }
    public int getAtk() {
        return Atk;
    }
    public void setAtk(int Atk) {
        this.Atk = Atk;
    }
    public int getDef() {
        return Def;
    }
    public void setDef(int Def) {
        this.Def = Def;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void Atk(Knight target){
        System.out.println(this.Name+" Attack "+target.Name);
        if(this.Hp <=0 || target.Hp<=0){
            checkHp(target);
        }
        else if(this.Atk-target.Def<=0){
            
        }
        else{
        target.Hp=target.Hp-(this.Atk-target.Def);
        checkHp(target);
        }
    }
    public void Unti(Knight target){
        System.out.println(this.Name+" Unti "+target.Name);
        
        if(this.Hp <=0 || target.Hp<=0){
            checkHp(target);
        }
        else if(this.Mp <=0 || this.Mp-200<=0){
            System.out.println(this.Name+" No MP");
            System.out.println("-----------------------");
        }
        else{
            this.Mp-=200;
            target.Hp=target.Hp-((this.Atk+200)-target.Def);
            checkHp(target);
        }       
    }
    public void checkHp(Knight target){
        if (target.Hp<=0 || this.Hp<=0) {
            if(target.Hp<=0){
               System.out.println(target.Name+" knockout"); 
            }
            else{
               System.out.println(this.Name+" knockout"); 
            }        
        }
        else
            System.out.println(target.Name+" Hp = "+target.Hp);
            System.out.println("-----------------------");
    }
}
public class Lab5As1 {
    public static void main(String[] args) {
        int num =5;
        Knight[] a=new Knight[num];
        for (int i = 0; i < a.length; i++) {
            a[i]= new Knight();
            a[i].setName("Knight"+(i+1));
            System.out.println(a[i].getName()+". Hp = "+a[i].getHp()+" Mp = "+a[i].getMp()+" Stk = "+a[i].getAtk()+" Def = "+a[i].getDef());
        }
        System.out.println("-----------------------");
     
            a[1].Atk(a[0]);
            a[0].Unti(a[1]);
            a[1].Atk(a[0]);
            a[0].Unti(a[1]);
            a[1].Atk(a[3]);
            a[0].Unti(a[1]);
            a[3].Atk(a[4]);
            a[3].Unti(a[2]);
            a[1].Atk(a[2]);
            a[3].Unti(a[4]);
            a[0].Unti(a[1]);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getName()+". Hp = "+a[i].getHp()+" Mp = "+a[i].getMp()+" Stk = "+a[i].getAtk()+" Def = "+a[i].getDef());
        }
        
    }
}
