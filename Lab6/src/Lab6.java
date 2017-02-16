
/**
 *
 * @author $_F
 */
class Human{
 private int HP;
 private int MP;
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
 
}
class Knight extends Human{
 private int ATK;
 
 public int getATK() {
 return ATK;
 }
 public void setATK(int ATK) {
 this.ATK = ATK;
 }
 public void Attack(Human h){
 h.setHP(h.getHP()-this.ATK);
 if(h.getHP()<=0){
 h.setHP(0);
 System.out.println("Hp is 0");
 }
 }
 public Knight(int HP,int MP,int ATK){
 this.setHP(HP);
 this.setATK(ATK);
 this.setMP(MP);
 }
}
class Mage extends Human{
private int MATK;
public int getMATK() {
return MATK;
}
public void setMATK(int MATK) {
this.MATK = MATK;
}
public void FireBolt(Human h){
if(this.getMP()>=30){
h.setHP(h.getHP()-this.MATK*2);
if(h.getHP()<=0){
h.setHP(0);
System.out.println("Hp is 0");
}
this.setMP(this.getMP()-30);
}
else{
System.out.println("MP is not enough");
}
}
public Mage(int HP,int MP,int MATK){
this.setHP(HP);
this.setMATK(MATK);
this.setMP(MP);
}
}
class Archer extends Human{
private int arrow;
private int ATK;
public void setArrow(int arrow){
    this.arrow=arrow;
}
public int getArrow(){
    return arrow;
}
public Archer(int HP,int MP,int ATK){
this.setHP(HP);
this.setATK(ATK);
this.setMP(MP);
}
public void Attack(Human h){
if(arrow>=1){
arrow -= 1;
h.setHP(h.getHP()-this.ATK);
if(h.getHP()<=0){
h.setHP(0);
System.out.println("Hp is 0");
}
}
else{
System.out.println("no more arrow");
}
}
public void ArrowCrafting(){
this.arrow+=100;
}
public int getATK() {
return ATK;
}
public void setATK(int ATK) {
this.ATK = ATK;
}

}

class Hunter extends Archer{
private int hawkATK;
public Hunter(int HP, int MP, int ATK,int hawkATK) {
super(HP, MP, ATK);
this.hawkATK = hawkATK;
}
public void hawkAttack(Human h){
h.setHP(h.getHP()-this.hawkATK);
if(h.getHP()<=0){
h.setHP(0);
System.out.println("Hp is 0");
}
}
public void Attack(Human h){
if(getArrow()>=1){
setArrow(getArrow() - 1);
if(Math.random()>0.5){
System.out.println("HawkATK!!!");
h.setHP(h.getHP()-this.hawkATK);
}
h.setHP(h.getHP()-this.getATK());
if(h.getHP()<=0){
h.setHP(0);
System.out.println("Hp is 0");
}
}
else{
System.out.println("no more arrow");
}
}
}
public class Lab6 {
    public static void main(String[] args) {
     Knight k = new Knight(30,20,10);
Knight k2 = new Knight(10,10,10);
Mage m = new Mage(20,50,20);
k.Attack(k2);
m.FireBolt(k);
m.FireBolt(k2);
Archer a = new Archer(30,20,10);
a.Attack(m);
a.ArrowCrafting();
a.Attack(m);
a.Attack(m);
Hunter h = new Hunter(40,20,20,20);
h.ArrowCrafting();
h.Attack(a);
    }
}
