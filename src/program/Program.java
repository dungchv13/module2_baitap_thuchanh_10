package program;

import manage.CandidatesManage;
import quantites.Candidates;

public class Program {

    public static void main(String[] args) {
        CandidatesManage manage = new CandidatesManage();
        Menus menu = new Menus();

        do{
            System.out.println("--------------MENU----------------");
            System.out.println("1.add.");
            System.out.println("2.update.");
            System.out.println("3.delete.");
            System.out.println("4.display all.");
            System.out.println("5.search by ID.");
            System.out.println("0.EXIT.");
            System.out.print("Chose : ");
            int choice = Integer.parseInt(Inputs.inputStr("[0-5]"));

            switch (choice){
                case 1:
                    menu.menu1(manage);
                    System.out.println("*********************");
                    break;
                case 2:
                    menu.menu2(manage);
                    System.out.println("*********************");
                    break;
                case 3:
                    menu.menu3(manage);
                    System.out.println("*********************");
                    break;
                case 4:
                    menu.menu4(manage);
                    System.out.println("*********************");
                    break;
                case 5:
                    menu.menu5(manage);
                    System.out.println("*********************");
                    break;
                case 0:
                    System.exit(0);
            }


        }while(true);
    }
}
