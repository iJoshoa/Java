/**
 *
 * @author $_F
 */
class Plane1{
    private int Hp;
    private int Def;
    private int mids;
    private int Atk;
    private String Name;
    public Plane1(String Name, int Hp,int Def,int mids,int Atk){
        this.Name=Name;
        this.Def=Def;
        this.Hp=Hp;
        this.mids=mids;
        this.Atk=Atk;
    }
    public int getHp() {
        return Hp;
    }
    public void setHp(int Hp) {
        this.Hp = Hp;
    }
    public int getDef() {
        return Def;
    }
    public void setDef(int Def) {
        this.Def = Def;
    }
    public int getmids() {
        return mids;
    }
    public void setmids(int mids) {
        this.mids = mids;
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
    public void Attack(Plane1 target){
        System.out.println(this.getName()+" Attack "+target.getName());
        if(this.Hp<=0||this.mids<=0||target.Hp<=0){
            System.out.println(" NO Attack ");
        }
        else{
            target.Hp=target.Hp-(this.Atk-target.Def);
            this.mids--;
            if(target.Hp<=0){
                target.Hp=0;
            }
            System.out.println(this.Name+" mids = "+this.mids);
            System.out.println(target.Name+" Hp = "+target.Hp);
        }
    }
    
}
public class plane{
    public static void main(String[] args) {
        Plane1 a = new Plane1("as",100,10,10,100);
        Plane1 b = new Plane1("bs",1000,10,10,100);
        a.Attack(b);
    }
}


