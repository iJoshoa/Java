
import java.util.Scanner;


/**
 *
 * @author $_F
 */
class Knight{
private int HP;
private int Atk;
private String name;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getHP() {
return HP;
}
public void setHP(int HP) {
this.HP = HP;
}
public int getAtk() {
return Atk;
}
public void setAtk(int Atk) {
this.Atk = Atk;
}
Knight(){
this.HP = 100;
this.Atk = 50;
this.name = "Naja";
}
Knight(int HP,int Atk,String name){
this.HP = HP;
this.Atk = Atk;
this.name = name;
}
public void Attack(Knight target){
System.out.print(this.name+" attacks "+target.getName());
target.HP = target.HP - this.Atk;
if(target.HP<=0){
target.HP = 0;
System.out.println(target.name+" knockout");
}
else{
System.out.println(target.name+" HP : "+target.getHP());
}
}
}
public class Lab5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
System.out.print("Enter number of Knights : ");
int num = s.nextInt();
Knight[] k = new Knight[num];
for (int i = 0; i < k.length; i++) {
System.out.print("Set HP of Knight #"+i+" : ");
int hp = s.nextInt();
System.out.print("Set Atk of Knight #"+i+" : ");
int atk = s.nextInt();
System.out.print("Set name of Knight #"+i+" : ");
String name = s.next();
k[i] = new Knight(hp,atk,name);
}
for (int i = 0; i < k.length; i++) {
System.out.println("Knight #"+i+" HP = "+k[i].getHP());
System.out.println("Knight #"+i+" Atk = "+k[i].getAtk());
System.out.println("Knight #"+i+" name = "+k[i].getName());

}    
k[0].Attack(k[1]);
k[1].Attack(k[2]);
k[2].Attack(k[0]);
k[2].Attack(k[0]);
k[2].Attack(k[1]);
k[1].Attack(k[0]);
k[0].Attack(k[2]);
}
}
