package practice08;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.equals(klass.getLeader())) {
            return getBasicInfo() + " I am Leader of " + klass.getDisplayName() + ".";
        } else {
            return getBasicInfo() + " I am at " + klass.getDisplayName() + ".";
        }
    }

    public String getBasicInfo() {
        return super.introduce() + " I am a Student.";
    }
}
