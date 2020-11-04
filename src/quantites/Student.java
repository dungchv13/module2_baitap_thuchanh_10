package quantites;

import java.io.Serializable;

public abstract class Student implements Serializable{
    private String id;
    private String name;
    private String address;
    private boolean prioritize;

    public Student() {
    }

    public Student(String id, String name, String address, boolean prioritize) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.prioritize = prioritize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPrioritize() {
        return prioritize;
    }

    public void setPrioritize(boolean prioritize) {
        this.prioritize = prioritize;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", prioritize=" + prioritize +
                '}';
    }
}
