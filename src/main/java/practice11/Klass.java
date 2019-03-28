package practice11;


import java.util.HashMap;
import java.util.Map;

public class Klass {
    private int number;
    private Person leader;
    private Map<Integer, Student> studentList;
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
        studentList = new HashMap<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student jerry) {
        if (!studentList.containsKey(jerry.getId())) {
            System.out.print("It is not one of us.\n");
            return;
        }
        leader = jerry;
        notifyTeacher(leader.getName() + " become Leader of " + getDisplayName() + ".");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isIn(Student student) {
        return number == student.getKlass().number ? true : false;
    }

    public Person getLeader() {
        return leader;
    }


    public void appendMember(Student student) {
        studentList.put(student.getId(), student);
        notifyTeacher(student.getName() + " has joined " + getDisplayName() + ".");
    }

    public void notifyTeacher(String msg) {
        if (teacher != null) {
            teacher.reply(msg);
        }
    }
}
