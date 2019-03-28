package practice09;

public class Student extends Person {
    private Klass klass;
    private Student leader;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public void assignLeader(Student student) {
        leader = student;
    }

    @Override
    public String introduce() {
        if (this.equals(klass.getLeader())) {
            return super.introduce() + " I am Leader of " + klass.getDisplayName() + ".";
        } else {
            return super.introduce() + " I am at " + klass.getDisplayName() + ".";
        }

    }
}
