import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        FootballPlayermanagement footballPlayermanagement = new FootballPlayermanagement();
        Coachmanagement Coachmanagement = new Coachmanagement();
        int mainchoice = 0;
        Mainmenu : do {
            mainmenu();
            mainchoice = SelectChoice();
            System.out.println("");
            switch(mainchoice) {
                case 1 -> {
                    FootballPlayermanagement.FootballPlayermanagementListMenu();
                    int textbookChoice = SelectChoice();
                    System.out.println("");
                    switch(textbookChoice) {
                        case 1 -> {
                            footballPlayermanagement.showAll();
                            System.out.println("");
                    }
                        case 2 -> {
                            footballPlayermanagement.add();
                            System.out.println("");
                    }
                        case 3 -> {
                            footballPlayermanagement.update();
                            System.out.println("");
                    }
                        case 4 -> {
                            footballPlayermanagement.delete();
                            System.out.println("");
                    }
                        case 5 -> {
                            footballPlayermanagement.search();
                            System.out.println("");
                    }
                        case 6 -> {
                            System.out.println("");
                            continue;
                    }
                        default -> {
                            System.out.println("Please enter the number of the function!");
                            System.out.println("-----------------------------------------------");
                            System.out.println("");
                    }
                    }
                }
                case 2 -> {
                    Coachmanagement.CoachmanagementListMenu();
                    int novelChoice = SelectChoice();
                    System.out.println("");
                    switch(novelChoice) {
                        case 1 -> {
                            Coachmanagement.showAll();
                            System.out.println("");
                    }
                        case 2 -> {
                            Coachmanagement.add();
                            System.out.println("");
                    }
                        case 3 -> {
                            Coachmanagement.update();
                            System.out.println("");
                    }
                        case 4 -> {
                            Coachmanagement.delete();
                            System.out.println("");
                    }
                        case 5 -> {
                            Coachmanagement.search();
                            System.out.println("");
                    }
                        case 6 -> {
                            System.out.println("");
                            continue;
                    }
                        default -> {
                            System.out.println("Please enter the number of the function!");
                            System.out.println("-----------------------------------------------");
                            System.out.println("");
                    }
                    }
                }
                case 3 -> {
                    System.out.println("Thank you for using the system!");
                    return;
                }
                default -> {
                    System.out.println("Please enter the number of the function!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("");
                }
            }
        } while(mainchoice != 3);
    }

    public static void mainmenu() {
        System.out.println("Football team manager System");
        System.out.println("--------------------------");
        System.out.println("1. FootballPlayermanagement");
        System.out.println("2. Coachmanagement");
        System.out.println("3. Exit");
        System.out.println("");
    }

    public static int SelectChoice() {
        System.out.print("Select your choice: ");
        return getSc().nextInt();
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }

    /**
     * @param aSc the sc to set
     */
    public static void setSc(Scanner aSc) {
        sc = aSc;
    }
}

