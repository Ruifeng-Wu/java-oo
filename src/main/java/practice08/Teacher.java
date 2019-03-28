package practice08;

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
            return getBasicInfo() + " I teach No Class.";
        }
        return getBasicInfo() + " I teach " + klass.getDisplayName() + ".";
    }

    public String getBasicInfo() {
        return super.introduce() + " I am a Teacher.";
    }

    public String introduceWith(Student jerry) {
        if (klass.equals(jerry.getKlass())) {
            return getBasicInfo() + " I teach " + jerry.getName() + ".";
        } else {
            return getBasicInfo() + " I don't teach " + jerry.getName() + ".";
        }
    }
}
