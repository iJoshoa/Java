/**
 *
 * @author $_F
 */
class Tank{

  
    private int Hp;
    private int bullet;
    private int def;
    private int power;
    private String name;
    public String name2;
    public Tank(String name,int Hp,int bullet,int def,int power){
        this.name=name;
        this.Hp=Hp;
        this.def=def;
        this.power=power;
        this.bullet=bullet;
    }
      public int getHp() {
        return Hp;
    }
    public void setHp(int Hp) {
        this.Hp = Hp;
    }
    public int getBullet() {
        return bullet;
    }
    public void setBullet(int bullet) {
        this.bullet = bullet;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void Attack(Tank target){
        System.out.println(this.name+" Attack "+target.name);
        if(this.Hp<=0||this.bullet<=0||target.Hp<=0){
            System.out.println("No Attack");
        }
        else{
            target.Hp=target.Hp-(this.power-target.def);
            bullet--;
            if(target.Hp<=0){
                target.Hp=0;
            }
            System.out.println(this.name+" bullet = "+this.bullet);
            System.out.println(target.name+" HP = "+target.Hp);
            
        }
    }
    
}
public class tClass {
    public static void main(String[] args) {
          Tank a= new Tank("a",100,20,10,300);
          Tank b = new Tank("b",200,20,5,20);
          a.Attack(b);
          
    }
}
