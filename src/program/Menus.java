package program;

import manage.CandidatesManage;
import quantites.Candidates;



public class Menus {
    public void menu1(CandidatesManage manage){
        System.out.println("*********************");
        System.out.print("Nhập ID(4 chữ số):");
        String id = Inputs.inputId1("\\d{4}",manage);
        manage.add(getCandidates(id));
    }

    public void menu2(CandidatesManage manage){
        System.out.println("*********************");
        System.out.print("Nhập ID(4 chữ số):");
        String id = Inputs.inputId2("\\d{4}",manage);
        manage.update(getCandidates(id));
    }

    public void menu3(CandidatesManage manage){
        System.out.println("*********************");
        //String id, String name, String address, boolean prioritize, double[] transcript, String block
        System.out.print("Nhập ID(4 chữ số):");
        String id = Inputs.inputId2("\\d{4}",manage);
        manage.delete(id);
    }
    public void menu4(CandidatesManage manage){
        System.out.println("*********************");
        manage.displayAll();
    }
    public void menu5(CandidatesManage manage){
        System.out.println("*********************");
        System.out.print("Nhập ID(4 chữ số):");
        String id = Inputs.inputId2("\\d{4}",manage);
        manage.displayById(id);
    }

    private Candidates getCandidates(String id) {
        System.out.print("Nhập tên(chữ cái đầu viết hoa):");
        String name = Inputs.inputStr("^[A-Z].*");
        System.out.print("Nhập địa chỉ:");
        String address = Inputs.inputStr(".+");
        System.out.print("Thí sinh có thuộc diện ưu tiên (X/O):");
        String pri = Inputs.inputStr("^[XO]{1}$");
        boolean prioritize = pri.equals("X");
        System.out.print("Nhập khối của thí sinh(A/B/C):");
        String block = Inputs.inputStr("[ABC]");

        double[] transcript = new double[3];
        System.out.print("Nhập điểm môn thi thứ nhất: ");
        transcript[0] = Double.parseDouble(Inputs.inputStr("\\d(.\\d{1,2})?"));
        System.out.print("Nhập điểm môn thi thứ hai: ");
        transcript[1] = Double.parseDouble(Inputs.inputStr("\\d(.\\d{1,2})?"));
        System.out.print("Nhập điểm môn thi thứ ba: ");
        transcript[2] = Double.parseDouble(Inputs.inputStr("\\d(.\\d{1,2})?"));

        return new Candidates(id,name,address,prioritize,transcript,block);
    }

}
