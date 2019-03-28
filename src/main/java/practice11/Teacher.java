package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        linkedList = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i).setTeacher(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    @Override
    public String introduce() {
        if (linkedList.isEmpty()) {
            return basicInfo() + " I teach No Class.";
        } else {
            String temp = basicInfo() + " I teach Class " + linkedList.get(0).getNumber();
            for (int i = 1; i < linkedList.size(); i++) {
                temp += ", " + linkedList.get(i).getNumber();
            }
            return temp + ".";
        }

    }

    public String basicInfo() {
        return super.introduce() + " I am a Teacher.";
    }

    public boolean isTeaching(Student jerry) {
        for (Klass cls : linkedList) {
            if (cls.isIn(jerry)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student jerry) {
        if (isTeaching(jerry)) {
            return basicInfo() + " I teach " + jerry.getName() + ".";
        } else {
            return basicInfo() + " I don't teach " + jerry.getName() + ".";
        }
    }

    public void reply(String msg) {
        System.out.print("I am " + getName() + ". I know " + msg + "\n");
    }
}
