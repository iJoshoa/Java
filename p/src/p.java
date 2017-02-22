class Kbin{
  
private int HP;
private int MP;
private int Atk;
private  int Def;
private  String Name;
Kbin(int HP,int MP,int Atk,int Def,String Name){
this.HP=HP;
this.MP=MP;
this.Atk=Atk;
this.Def=Def;
this.Name=Name;
}
public void attack(Kbin h){
    if( this.getMP()<=20){
        System.out.println(this.getName()+":โจมตีไม่ได้ ");//ไม่มีกะสุน
    }
    if(h.getHP()<=0){
        System.out.println(this.getName()+"เครื่องตก");
    }
    else{
        this.setMP(this.getMP() - 20);
    System.out.println(this.getName()+": โจมตี: "+h.getName());
    h.setHP(h.getHP()-(this.getAtk()-h.Def));
    
    System.out.println(h.getName()+"HP:"+h.getHP());
    }
}public void missai(){
 if(    this.getMP()<=50){
     System.out.println(this.getName()+":มานาไม่พอ");
 }
 else{
     this.setMP(this.getMP() - 20);
    System.out.println(this.getName()+"เพิ่มกระสุน:"+this.getAtk());
    this.setAtk(this.getAtk() + 20);
    System.out.println(this.getName()+"มีกระสุน:"+this.getAtk());
 }
}

    public int getHP() {
        return HP;
    }

   
    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    


}
public class p {
    public static void main(String[]args){
    Kbin c=new Kbin(400,100,50,70,"เครืองบิน407");
    Kbin c2=new Kbin(600,100,50,50,"เครืองบิน555");
    Kbin c3=new Kbin(300,100,50,100,"เครืองบินโหด");
    Kbin c4=new Kbin(400,50,100,60,"เครืองบินกาก");
    
    c.attack(c2);
    c3.attack(c);
    c.attack(c4);
    c.missai();
    }
}