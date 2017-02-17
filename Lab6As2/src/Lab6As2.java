/*
 * To change this license header, choose License Headers in Project Properties.

/**
 *
 * @author $_F
 */
class Human{
 private int HP;
 private int MP;
 private String Name;
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
      public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
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
    public Knight(String Name,int HP,int MP,int ATK){
        this.setName(Name);
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
    public Mage(String Name, int HP,int MP,int MATK){
        this.setName(Name);
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
    public Archer(String Name,int HP,int MP,int ATK){
        this.setName(Name);
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

    public void sethawkATK(int hawkATK){
        this.hawkATK=hawkATK;
    }
    public int gethawkATK(){
        return hawkATK;
    }
    
    public Hunter(String Name,int HP, int MP, int ATK,int hawkATK) {
        super(Name,HP, MP, ATK);
      
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
class Boss extends Hunter{
    private int bATK;
    public void setbATK(int bATK){
        this.bATK=bATK;
    }
    public int getbATK(){
        return bATK;
    }
    public Boss(String Name,int HP,int MP, int ATK, int hawkATK, int bATK){
        super(Name,HP,MP,ATK,hawkATK);
        this.bATK=bATK;
    }
    public void bATK(Human b){
    System.out.println(this.getName()+" target "+b.getName());
    b.setHP(b.getHP()-this.bATK);
        if(b.getHP()<=0){
            b.setHP(0);
            System.out.println("Hp "+b.getName()+" is 0");
        }
        else{
            System.out.println("Hp "+b.getName()+" = "+b.getHP());
        }
        System.out.println("------------------------");
    }
}
class Eroniea extends Mage{
    private int eATK;
    public void seteAtk(int eATK){
        this.eATK=eATK;
    }
    public int geteATK(){
        return eATK;
    }
    public Eroniea(String Name,int HP,int MP,int MATK,int eATK){
    super(Name,HP,MP,MATK);
    this.eATK=eATK;
    }
    
    public void fire(Human b){
    System.out.println(this.getName()+" target "+b.getName()+" By fire");
    if(this.getMP()-40<=0){
        System.out.println("No mana");
    }
    else{
        this.setMP(this.getMP()-40);
    b.setHP(b.getHP()-(this.eATK+10));
        if(b.getHP()<=0){
            b.setHP(0);
            System.out.println("Hp "+b.getName()+" is 0");
        }
        else{
            System.out.println("Hp "+b.getName()+" = "+b.getHP()+" Mana = "+this.getName()+" "+this.getMP());
        }
        System.out.println("------------------------");
    }
    }
     public void ice(Human b){
    System.out.println(this.getName()+" target "+b.getName()+" By ice");
    if(this.getMP()-60<=0){
        System.out.println("No mana");
    }
    else{
        this.setMP(this.getMP()-60);
    b.setHP(b.getHP()-(this.eATK+20));
        if(b.getHP()<=0){
            b.setHP(0);
            System.out.println("Hp "+b.getName()+" is 0");
        }
        else{
            System.out.println("Hp "+b.getName()+" = "+b.getHP()+" Mana = "+this.getName()+" "+this.getMP());
        }
        System.out.println("------------------------");
    }
     }
     
      public void lava(Human b){
    System.out.println(this.getName()+" target "+b.getName()+" By lava");
    if(this.getMP()-40<=0){
        System.out.println("No mana");
    }
    else{
        this.setMP(this.getMP()-100);
    b.setHP(b.getHP()-(this.eATK+30));
        if(b.getHP()<=0){
            b.setHP(0);
            System.out.println("Hp "+b.getName()+" is 0");
        }
        else{
            System.out.println("Hp "+b.getName()+" = "+b.getHP()+" Mana = "+this.getName()+" "+this.getMP());
        }
        System.out.println("------------------------");
    }
    }
}

public class Lab6As2 {
    public static void main(String[] args) {
        Knight k = new Knight("Knight",400,200,40);//hp mp atk
        Mage m = new Mage("Mage",100,500,10);//hp mp matk
        Archer a = new Archer("Archer",200,100,70);//hp mp atk
        Hunter h = new Hunter("Hunter",300,200,70,100);//hp mp atk hawkATK
        Boss b = new Boss("Boss",600,300,200,100,150);//hp mp atk hawATK bATK
        Eroniea e = new Eroniea("Eronire",400,500,50,20);//hp mp matk eATK
        
        e.fire(k);
        e.ice(k);
        e.lava(k);
        
        e.lava(m);
        e.lava(m);
        e.ice(a);
        e.fire(h);
        e.ice(b);
        
    }
}
