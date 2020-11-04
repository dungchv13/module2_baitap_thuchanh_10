package quantites;

import java.io.Serializable;

public class Candidates extends Student {
    private double[] transcript = new double[3];
    private String block;

    private final String[] blockA = {"math","physics","chemistry"};
    private final String[] blockB = {"math","chemistry","biological"};
    private final String[] blockC = {"literary","history","geography"};

    public Candidates() {
    }

    public Candidates(String id, String name, String address, boolean prioritize, double[] transcript, String block) {
        super(id, name, address, prioritize);
        this.transcript = transcript;
        this.block = block;
    }

    public double[] getTranscript() {
        return transcript;
    }

    public void setTranscript(double[] transcript) {
        this.transcript = transcript;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public boolean isPrioritize() {
        return super.isPrioritize();
    }

    @Override
    public void setPrioritize(boolean prioritize) {
        super.setPrioritize(prioritize);
    }

    @Override
    public String toString() {
        String result = "Candidates{"+
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", prioritize=" + this.isPrioritize();
        if(block.equals("A")){
            result += ", block='" + block + '\'' +
                    ", "+blockA[0] + " = "+transcript[0]+'\'' +
                    ", "+blockA[1] + " = "+transcript[1]+'\'' +
                    ", "+blockA[2] + " = "+transcript[2]+'\'' +
                    "} ";

        }else if(block.equals("B")){
            result += ", block='" + block + '\'' +
                    ", "+blockB[0] + " = "+transcript[0]+'\'' +
                    ", "+blockB[1] + " = "+transcript[1]+'\'' +
                    ", "+blockB[2] + " = "+transcript[2]+'\'' +
                    "} ";
        }else{
            result += ", block='" + block + '\'' +
                    ", "+blockC[0] + " = "+transcript[0]+'\'' +
                    ", "+blockC[1] + " = "+transcript[1]+'\'' +
                    ", "+blockC[2] + " = "+transcript[2]+'\'' +
                    "} ";
        }
        return result;

    }
}
