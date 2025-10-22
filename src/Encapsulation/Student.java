package Encapsulation;

public class Student {
    private int rollNumber;
    private String name;
    private boolean isAttended;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        System.out.println("RollNumber" + rollNumber);
    }

    public String getName() {
        return name;
    }

    public boolean isAttended() {
        return isAttended;
    }

    public void setAttended(boolean attended) {
        isAttended = attended;
        System.out.println(isAttended);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
}
