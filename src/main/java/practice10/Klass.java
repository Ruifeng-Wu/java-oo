package practice10;

import java.util.HashMap;
import java.util.Map;

public class Klass {
    private int number;
    private Person leader;
    private Map<Integer,Student> studentList;


    public Klass(int number) {
        this.number = number;
        studentList=new HashMap<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student jerry) {
        if (!studentList.containsKey(jerry.getId())){
            System.out.print("It is not one of us.\n");
            return;
        }
        leader=jerry;
    }

    public boolean isIn(Student student){
        return number==student.getKlass().number?true:false;
    }
    public Person getLeader() {
        return leader;
    }

    public void appendMember(Student student){
        studentList.put(student.getId(),student);
    }
}
