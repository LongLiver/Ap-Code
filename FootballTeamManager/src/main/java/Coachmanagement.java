import java.util.*;

public class Coachmanagement extends Personmanagement {
    private static final Scanner sc = new Scanner(System.in);
    private final ArrayList<Coach> CoachmanagementList = new ArrayList<>();

@Override
public void add() {
    try {
        System.out.println("Add Information");
        String ID = inputID();
        for (int i = 0; i< CoachmanagementList.size(); i++) {
            if (CoachmanagementList.get(i).getId().equalsIgnoreCase(ID)) {
                System.out.println(" already exist!");
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        try {
            String name = inputName();
            String addres = inputaddres();
            String word = inputword();
            Coach coach = new Coach(ID,name, addres, word);
            CoachmanagementList.add(coach);
            System.out.println("Add new successful Coach!");
        } catch(NumberFormatException e) {
            System.out.println("please enter correct input!");
        }
    } catch(Exception e) {
        System.out.println("Please enter the field!");
    }
}

    @Override
    public void showAll() {
            System.out.println("----------------CoachList-----------------");
            for (Coach coach : CoachmanagementList) {
                System.out.println("ID    :      "   +   coach.getId());
                System.out.println("Name  :      "   +   coach.getName());
                System.out.println("addres :      "   +   coach.getaddres());
                System.out.println("Word  :      "   +   coach.getWord());
                System.out.println("-----------------------------------------------");
                System.out.println("");
            }

    }

    @Override
    public void update() {
        String n = selectID();
        for (int i = 0; i < CoachmanagementList.size(); i++) {
            if(CoachmanagementList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("Update ");
                try {
                    CoachmanagementList.get(i).setName(inputName());
                    CoachmanagementList.get(i).setaddres(inputaddres());
                    CoachmanagementList.get(i).setWord(inputword());
                } catch(NumberFormatException e) {
                    System.out.println("please enter correct input!");
                    return;
                }
                System.out.println("Update Successfully!!!");
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("Coach does not exist!!!");
        System.out.println("-----------------------------------------------");

    }

    @Override
    public void delete() {
        String n = selectID();
        for (int i = 0; i < CoachmanagementList.size(); i++) {
            if (CoachmanagementList.get(i).getId().equals(n)) {
                Coach coach  = CoachmanagementList.get(i);
                CoachmanagementList.remove(coach);
                System.out.println("Delete Successfully!!!");
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("Coach does not exist!!!");
        System.out.println("-----------------------------------------------");

    }

    @Override
    public void search() {
        String n = selectID();
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < CoachmanagementList.size(); i++) {
            if (CoachmanagementList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("ID     :      "   +   CoachmanagementList.get(i).getId());
                System.out.println("name   :      "   +   CoachmanagementList.get(i).getName());
                System.out.println("addres :      "   +   CoachmanagementList.get(i).getaddres());
                System.out.println("word:      "   +   CoachmanagementList.get(i).getWord());
                return;
            }
        }
        System.out.println("Coach does not exist!!!");
        System.out.println("-----------------------------------------------");
    }
    
 


    public void CoachmanagementListMenu() {
        System.out.println("Coach management List System");
        System.out.println("--------------------------");
        System.out.println("1. Show list of CoachmanagementList");
        System.out.println("2. Add new CoachmanagementList");
        System.out.println("3. Update the CoachmanagementList");
        System.out.println("4. Delete the CoachmanagementList");
        System.out.println("5. Search for the CoachmanagementList");
        System.out.println("6. Back to Main Menu");
        System.out.println("");

    }

    public String inputCoach() {
        System.out.print("Input Coach: ");
        return sc.nextLine();
    }
}
