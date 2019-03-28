package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> linkedList;


    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public LinkedList getClasses() {
        return linkedList;
    }
}
