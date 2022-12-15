import java.util.*;
public class FootballPlayermanagement extends Personmanagement {
    private static final Scanner sc = new Scanner(System.in);
    private final ArrayList<FootballPlayer> FootballPlayermanagementList = new ArrayList<>();

    @Override
    public void add() {
        try {
            System.out.println("Add Football Player Information");
            String id = inputID();
            for (int i = 0; i < FootballPlayermanagementList.size(); i++) {
                if (FootballPlayermanagementList.get(i).getId().equalsIgnoreCase(id)) {
                    System.out.println("Football Player already exist!");
                    System.out.println("-----------------------------------------------");
                    return;
                }
            }
            try {
                String name = inputName();
                String addres= inputaddres();
                String ltb = inputltb();
                FootballPlayer footballplayer = new FootballPlayer(id, name, addres, ltb);
                FootballPlayermanagementList.add(footballplayer);
                System.out.println("Add new successful Football Player!");
            } catch(NumberFormatException e) {
                System.out.println("please enter correct input!");
            }
        } catch(Exception e) {
            System.out.println("Please enter the field!");
        }
    }

    @Override
    public void showAll() {
        System.out.println("----------------FootballPlayermanagementList-----------------");
        for (FootballPlayer footballplayer : FootballPlayermanagementList) {
            System.out.println("ID    :      "   +   footballplayer.getId());
            System.out.println("Name  :      "   +   footballplayer.getName());
            System.out.println("Addres:      "   +   footballplayer.getaddres());
            System.out.println("Basic Salary   :      "   +   footballplayer.getltb());
            System.out.println("-----------------------------------------------");
            System.out.println("");
        }
    }

   



    @Override
    public void update() {
        String n = selectID();
        for (int i = 0; i < FootballPlayermanagementList.size(); i++) {
            if(FootballPlayermanagementList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("Update ");
                try {
                    FootballPlayermanagementList.get(i).setName(inputName());
                    FootballPlayermanagementList.get(i).setaddres(inputaddres());
                    FootballPlayermanagementList.get(i).setltb(inputltb());
                } catch(NumberFormatException e) {
                    System.out.println("please enter correct input!");
                    return;
                }
                System.out.println("Update Successfully!!!");
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("Football Player does not exist!!!");
        System.out.println("-----------------------------------------------");
    }

    
    @Override
    public void delete() {
        String n = selectID();
        for (int i = 0; i < FootballPlayermanagementList.size(); i++) {
            if (FootballPlayermanagementList.get(i).getId().equals(n)) {
                FootballPlayer footballPlayer = FootballPlayermanagementList.get(i);
                FootballPlayermanagementList.remove(footballPlayer);
                System.out.println("Delete Successfully!!!");
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("Football Player does not exist!!!");
        System.out.println("-----------------------------------------------");
    }

   


    @Override
    public void search() {
        String n = selectID();
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < FootballPlayermanagementList.size(); i++) {
            if (FootballPlayermanagementList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("ID     :      "   +   FootballPlayermanagementList.get(i).getId());
                System.out.println("name   :      "   +   FootballPlayermanagementList.get(i).getName());
                System.out.println("Addres :      "   +   FootballPlayermanagementList.get(i).getaddres());
                System.out.println("Basic Salary    :      "   +   FootballPlayermanagementList.get(i).getltb());
                return;
            }
        }
        System.out.println("Football Player does not exist!!!");
        System.out.println("-----------------------------------------------");
    }
    
 


    public static void FootballPlayermanagementListMenu() {
        System.out.println("Football Player managementList System");
        System.out.println("--------------------------");
        System.out.println("1. Show list of FootballPlayermanagement");
        System.out.println("2. Add new FootballPlayermanagement");
        System.out.println("3. Update the FootballPlayermanagement");
        System.out.println("4. Delete the FootballPlayermanagement");
        System.out.println("5. Search for the FootballPlayermanagement");
        System.out.println("6. Back to Main Menu");
        System.out.println("");
    }
    
    public String inputFootballPlayer() {
        System.out.println("Input FootballPlayer : ");
        return sc.nextLine();
    }
}

