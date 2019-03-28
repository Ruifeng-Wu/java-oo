package practice10;

import practice09.Person;
import practice09.Student;

import java.util.HashMap;
import java.util.Map;

public class Klass {
    private int number;
    private practice09.Person leader;
    private Map<Integer,practice09.Student> studentList;


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

    public void assignLeader(practice09.Student jerry) {
        if (!studentList.containsKey(jerry.getId())){
            System.out.print("It is not one of us.\n");
            return;
        }
        leader=jerry;
    }

    public Person getLeader() {
        return leader;
    }

    public void appendMember(Student student){
        studentList.put(student.getId(),student);
    }
}
