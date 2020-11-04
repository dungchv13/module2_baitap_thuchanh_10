package manage;

import quantites.Candidates;

import java.util.ArrayList;

public class CandidatesManage {
    private ArrayList<Candidates> myList = new ArrayList<>();
    private FileProcess fileProcess = new FileProcess();


    public void add(Candidates candidate){
        myList = fileProcess.readFile();
        if(myList == null){
            myList = new ArrayList<>();
        }
        myList.add(candidate);
        fileProcess.writeFile(myList);
    }
    public void update(Candidates candidate){
        myList = fileProcess.readFile();
        int index = 0;
        for (Candidates c:myList) {
            if(c.getId().equals(candidate.getId())){
                index = myList.indexOf(c);
            }
        }
        myList.remove(index);
        myList.add(index,candidate);
        fileProcess.writeFile(myList);
    }
    public void delete(String id){
        myList = fileProcess.readFile();
        int index = 0;
        for (Candidates c:myList) {
            if(c.getId().equals(id)){
                index = myList.indexOf(c);
            }
        }
        myList.remove(index);
        fileProcess.writeFile(myList);

    }
    public void displayAll(){
        myList = fileProcess.readFile();
        for (Candidates c:myList) {
            System.out.println(c);
        }
    }
    public void displayById(String id){
        Candidates c = search(id);
        System.out.println(c);

    }
    public Candidates search(String id){
        myList = fileProcess.readFile();
        for (Candidates c:myList) {
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
    public boolean isContain(String id){
        myList = fileProcess.readFile();
        if(myList == null){
            return false;
        }
        for (Candidates c:myList) {
            if(c.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

}
