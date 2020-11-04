package manage;

import quantites.Candidates;

import java.io.*;
import java.util.ArrayList;

public class FileProcess {
    private final String PATH = "CandidatesList";
    public void writeFile(ArrayList<Candidates> myList){
        try{
            FileOutputStream fos = new FileOutputStream(PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(myList);

            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Candidates> readFile(){
        try{
            FileInputStream fis = new FileInputStream(PATH);
            ObjectInputStream oos = new ObjectInputStream(fis);
            return (ArrayList<Candidates>) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}
