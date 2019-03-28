package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String basicInfo() {
        return super.introduce() + " I am a Student.";
    }

    @Override
    public String introduce() {
        if (this.equals(klass.getLeader())) {
            return basicInfo() + " I am Leader of " + klass.getDisplayName() + ".";
        } else {
            return basicInfo() + " I am at " + klass.getDisplayName() + ".";
        }
    }
}
