package practice11;

import org.apache.commons.math3.filter.KalmanFilter;

import java.util.LinkedList;

public class Klass {
    private int number;
    private Student leader;
    private LinkedList<Teacher> teacherList = new LinkedList<>();
    public Klass(int _number) {
        number = _number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {return leader;}

    public void register(Teacher teacher) {
        teacherList.add(teacher);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass){
            Klass klass = (Klass) obj;
            return number==klass.getNumber();
        }
        return super.equals(obj);
    }

    public boolean isIn(Student student) {
        return equals(student.getKlass());
    }

    public String getDisplayName(){
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if(isIn(student)){
            leader = student;
            for(Teacher teacher: teacherList){
                if(teacher.isTeaching(student)){
                    teacher.notifyLeader(student);
                }
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if(teacherList!=null)
            for(Teacher teacher: teacherList){
                if(teacher.isTeaching(student)){
                    teacher.notifyMember(student);
                }
            }
    }
}
