import java.util.Scanner;

/**
 *
 * @author $_F
 */
public class Lab1As1 {
    public static void main(String[] args) {
        String name,ni,id,de,fa,uni;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Name-Surname : ");
        name = sc.nextLine();
        
        System.out.print("Nickname : ");
        ni = sc.nextLine();
        
        System.out.print("Student ID : ");
        id = sc.nextLine();
        
        System.out.print("Department : ");
        de = sc.nextLine();
        
        System.out.print("Faculty : ");
        fa = sc.nextLine();
        
        System.out.print("University : ");
        uni = sc.nextLine();
               
        System.out.println("My name is "+name);
        System.out.println("My nickname is "+ni);
        System.out.println("My student id is "+id);
        System.out.println("I am studying at department of "+de);
        System.out.println("Faculty of "+fa);
        System.out.println(uni);
        
    }
}
