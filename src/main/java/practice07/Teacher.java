package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
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
            return selfIntroduction() + " I teach No Class.";
        } else {
            return selfIntroduction() + " I teach " + klass.getDisplayName() + ".";
        }
    }

    public String selfIntroduction() {
        return super.introduce() + " I am a Teacher.";
    }

    public String introduceWith(Student jerry) {
        if (klass.getNumber() == jerry.getKlass().getNumber()) {
            return selfIntroduction() + " I teach " + jerry.getName() + ".";
        } else {
            return selfIntroduction() + " I don't teach " + jerry.getName() + ".";
        }
    }
}
