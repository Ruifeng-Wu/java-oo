package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return basicInfo() + " I teach No Class.";
        } else {
            return basicInfo() + " I teach " + klass.getDisplayName() + ".";
        }

    }

    public String basicInfo() {
        return super.introduce() + " I am a Teacher.";
    }
}
