package program;

import manage.CandidatesManage;

import java.util.Scanner;

public class Inputs {
    private static Scanner scanner = new Scanner(System.in);
    private static ValidateInput val = new ValidateInput();

    public static String inputStr(String regex){
        String result = scanner.nextLine();
        if(!val.isValidate(regex,result)){
            System.out.println("Your input isn't match the format!");
            System.out.print("Re-enter: ");
            result = inputStr(regex);
        }
        return result;
    }
    public static String inputId1(String regex, CandidatesManage manage){
        String result = scanner.nextLine();
        if(!val.isValidate(regex,result)){
            System.out.println("Your input isn't match the format!");
            System.out.print("Re-enter: ");
            result = inputId1(regex,manage);
        }
        if(manage.isContain(result)){
            System.out.println("Đã có thí sinh có ID này!");
            System.out.print("Re-enter: ");
            result = inputId1(regex,manage);
        }
        return result;
    }
    public static String inputId2(String regex, CandidatesManage manage){
        String result = scanner.nextLine();
        if(!val.isValidate(regex,result)){
            System.out.println("Your input isn't match the format!");
            System.out.print("Re-enter: ");
            result = inputId1(regex,manage);
        }
        if(!manage.isContain(result)){
            System.out.println("Không thí sinh nào có ID này!");
            System.out.print("Re-enter: ");
            result = inputId1(regex,manage);
        }
        return result;
    }
}
