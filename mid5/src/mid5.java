
/**
 *
 * @author $_F
 */
class Human{
    private int Hp;
    private int Mp;
    private int Atk;
    private int Def;
    private String name;
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
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Knight extends Human{
    public Knight(String name,int Hp,int Mp,int Atk,int Def){
        this.setName(name);
        this.setHp(Hp);
        this.setMp(Mp);
        this.setAtk(Atk);
        this.setDef(Def);      
    }
    public void KAttack(Human target){
        System.out.println(this.getName()+" Attack "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-(this.getAtk()-target.getDef()));
            if(target.getHp()<=0){
                target.setHp(5);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
             System.out.println("------------------");
        }
    }
    public void Kskill1(Human target){
        System.out.println(this.getName()+" Kskill 1 "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0||this.getMp()-10<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-((this.getAtk()+10)-target.getDef()));
            this.setMp(this.getMp()-10);
            if(target.getHp()<=0){
                target.setHp(0);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
    public void Kskill2(Human target){
        System.out.println(this.getName()+" Kskill 2 "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0||this.getMp()-20<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-((this.getAtk()+20)-target.getDef()));
            this.setMp(this.getMp()-20);
            if(target.getHp()<=0){
                target.setHp(0);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
    public void Kskill3(Human target){
        System.out.println(this.getName()+" Kskill 3 "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0||this.getMp()-30<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-((this.getAtk()+30)-target.getDef()));
            this.setMp(this.getMp()-30);
            if(target.getHp()<=0){
                target.setHp(0);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
    public void Kskill4(Human target){
        System.out.println(this.getName()+" Kskill 4 "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0||this.getMp()-40<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-((this.getAtk()+40)-target.getDef()));
            this.setMp(this.getMp()-40);
            if(target.getHp()<=0){
                target.setHp(0);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
}
class Magic extends Human{
    public Magic(String name,int Mp,int Atk,int Def){
        this.setName(name);
        this.setAtk(Atk);
        this.setDef(Def);
        this.setMp(Mp);
        this.setHp(1000);
    }
    public void MAttack(Human target){
        System.out.println(this.getName()+" Attack "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-(this.getAtk()-target.getDef()));
            if(target.getHp()<=0){
                target.setHp(5);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
             System.out.println("------------------");
        }
    }
    public void MHeal(){
        System.out.println(this.getName()+" heal");
        if(this.getMp()-20<=0){
            System.out.println("No heal");
        }
        else{
            this.setHp(this.getHp()+50);
            if(this.getHp()>1000){
                this.setHp(1000);
            }
            this.setMp(this.getMp()-20);
            
            System.out.println(this.getName()+" Hp = "+this.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
    public void Mskill2(Human target){
        System.out.println(this.getName()+" Mskill 2 "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0||this.getMp()-30<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-((this.getAtk()+40)-target.getDef()));
            this.setMp(this.getMp()-30);
            if(target.getHp()<=0){
                target.setHp(0);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
    public void Mskill3(Human target){
        System.out.println(this.getName()+" Mskill 3 "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0||this.getMp()-40<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-((this.getAtk()+50)-target.getDef()));
            this.setMp(this.getMp()-40);
            if(target.getHp()<=0){
                target.setHp(0);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
    public void Mskill4(Human target){
        System.out.println(this.getName()+" Mskill 4 "+target.getName());
        if(this.getHp()<=0||target.getHp()<=0||this.getMp()-50<=0){
            System.out.println("No attack");
        }
        else{
            target.setHp(target.getHp()-((this.getAtk()+60)-target.getDef()));
            this.setMp(this.getMp()-50);
            if(target.getHp()<=0){
                target.setHp(0);
            }
            System.out.println(target.getName()+" Hp = "+target.getHp());
            System.out.println(this.getName()+" Mp = "+this.getMp());
            System.out.println("------------------");
        }
    }
}
public class mid5 {
    public static void main(String[] args) {
        Knight a = new Knight("pae",300,200,30,20);
        Knight b = new Knight("gade",300,200,30,20);
        Magic m1= new Magic("oat",200,20,10);
        Magic m2= new Magic("byte",200,20,10);
        a.KAttack(b);
        a.Kskill1(b);
        a.Kskill2(b);
        a.Kskill3(b);
        a.Kskill4(b);
        m1.MAttack(m2);
        m1.MHeal();
        m2.Mskill4(m1);
         m1.MHeal();
          m1.MHeal();
           m1.MHeal();
                   
    }
}