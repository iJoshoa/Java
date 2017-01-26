
/**
 *
 * @author $_F
 */
class redpotion{
    private int recovery;
    redpotion(){
        this.recovery = 100;
    }
    public int getRecovery() {
        return recovery;
    }
}
class knight{
    private String name;
    private int HP;
    private int atk;
    
    knight(String name,int HP,int atk){
        this.name = name;
        this.HP = HP;
        this.atk = atk;
    }
    public void drinkpotion(redpotion red){
        this.HP = this.HP+red.getRecovery();
        this.checkHP(this);
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void checkHP(knight target){
        if(target.HP<=0){
        System.out.println(target.name+" knockout");
        }
        else{
            System.out.println(target.name+" HP : "+target.HP);
        }       
    }
    public void atk(knight target){
        System.out.println(this.name + " attack "+target.name);
        target.HP = target.HP-this.atk;
        this.checkHP(target);
    }
    public void bash(knight target,int bashlv){
        System.out.println(this.name + " Bash "+target.name);
        target.HP = target.HP-(this.atk*bashlv);
        this.checkHP(target);
    }
}
public class Lab4 {
    public static void main(String[] args) {
        knight rav = new knight("Ravkung",10000,100);
        knight jak = new knight("Jakkung",200000,9999);
        redpotion red = new redpotion();
        rav.atk(jak);
        for (int i = 0; i < 10; i++) {
            rav.bash(jak, 10);
        }
        jak.atk(rav);
        for (int i = 0; i < 10; i++) {
            rav.drinkpotion(red);
        }
        for (int i = 0; i < 10; i++) {
            rav.bash(jak, 10);
        }
        jak.bash(rav, 10);

    }
}
