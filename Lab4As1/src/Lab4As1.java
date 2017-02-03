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
จากนั้นให้สร้าง Object knight ขึ้นมาอย่างน้อย 2 Objects และมีการใช้ฟังก์ชันโจมตี หรือท่าพิเศษ อย่างน้อย 5
ครั้ง
*/
class knight{
    private String Name;
    private int Hp;
    private int Mp;
    private int Atk;
    private int Def; 
    knight(String Name,int Hp,int Mp,int Atk,int Def){
        this.Name=Name;
        this.Hp=Hp;
        this.Mp=Mp;
        this.Atk=Atk;
        this.Def=Def;
    }
    knight(){
    
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setHP(int Hp){
        this.Hp=Hp;
    }
    public int getHp(){
        return Hp;
    }
    public void setMp(int Mp){
        this.Mp=Mp;
    }
    public int getMp(){
        return Mp;
    }
    public void setAtk(int Atk){
        this.Atk=Atk;
    }
    public int getAtk(){
        return Atk;
    }
    public void setDef(int Def){
        this.Def=Def;
    }
    public int getDef(){
        return Def;
    }
    public void atk(knight target){
        System.out.println(this.Name + " Attack "+target.Name);
        if(this.Hp <=0 || target.Hp<=0) {
            checkhp(target);
        }
        else if(this.Atk-target.Def<=0){
        
        }
        else{
            
            target.Hp = target.Hp-(this.Atk-target.Def);
            checkhp(target);
        }
    }
    public void unti(knight target){
        System.out.println(this.Name+" Unti "+target.Name);
        if(this.Hp <=0 || target.Hp<=0) {
            checkhp(target);
        }
        else if((this.Atk+500)-target.Def<=0||this.Mp-150<=0){
            System.out.println("Not atk");
            System.out.println(target.Name+" HP "+target.Hp);
        }
        else {        
            this.Mp=this.Mp-150;
            target.Hp= target.Hp-((this.Atk+200)-target.Def);
            checkhp(target);
        }
    }
    public void checkhp(knight target){
        if(this.Hp <=0){ 
            System.out.println(this.Name+" knockout"); 
        }
        else if(target.Hp<=0){
            System.out.println(target.Name+" knockout");
        }
        else
            System.out.print(target.Name+" Hp="+target.Hp);
            System.out.println(" Mp = "+this.Mp);
            System.out.println("----------------------");
    }
}
public class Lab4As1 {
    public static void main(String[] args) {
        knight a=new knight("a",1000,400,100,20);
        knight b=new knight("b",1000,500,200,30);
        
        System.out.println("Name="+a.getName()+" Hp="+a.getHp()+" Mp="+a.getMp()+" Atk="+a.getAtk()+" Def="+a.getDef());
        System.out.println("Name="+b.getName()+" Hp="+b.getHp()+" Mp="+b.getMp()+" Atk="+b.getAtk()+" Def="+b.getDef());
        System.out.println("----------------------");
        
        a.atk(b);
        b.atk(a);
        a.unti(b);
        b.unti(a);
        a.unti(b);
    }
}
