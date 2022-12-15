import java.util.Scanner;
public  abstract class Personmanagement {
    private static final  Scanner sc = new Scanner(System.in);
    public abstract void add();
    public abstract void showAll();
    public abstract void update();
    public abstract void delete();
    public abstract void search();
    
    public String selectID() {
        System.out.print("Input ID : ");
        return sc.nextLine();
    }
    public String inputID() {
        System.out.print("Input ID: ");
        return sc.nextLine();
    }

    public String inputName() {
        System.out.print("Input Name: ");
        return sc.nextLine();
    }

    public String inputaddres() {
        System.out.print("Input Addres: ");
        return sc.nextLine();
    }
    
    public String inputword(){
        System.out.print("Input Word: ");
        return sc.nextLine();
    }
    public String inputltb() {       
        System.out.print("Input Basic salary ");
        return sc.nextLine();
    }
}