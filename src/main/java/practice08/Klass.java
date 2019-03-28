package practice08;

public class Klass {
    private int number;
    private Person leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getLeader() {
        return leader;
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student jerry) {
        leader = jerry;
    }
}
