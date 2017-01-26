
/**
 *
 * @author $_F
 */
class knight{
 private String name;
 private int HP;
 private int atk;
 knight(String name,int HP,int atk){
 this.name = name;
 this.HP = HP;
 this.atk = atk;
 }
 public void atk(knight target){
 System.out.println(this.name + " attack "+target.name);
 target.HP = target.HP-this.atk;
 if(target.HP<=0){
 System.out.println(target.name+" knockout");
 }
 else{
 System.out.println(target.name+" HP : "+target.HP);
 }
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
} 
public class Lab4 {
    public static void main(String[] args) {
      
 night rav = new knight();
 knight jak = new knight("Jak",2000,999);
  //knight rav = new knight();
 rav.atk(jak);
 jak.atk(rav);
 jak.atk(rav);  
    }
}
