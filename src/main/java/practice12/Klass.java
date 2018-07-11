package practice12;

import com.sun.org.apache.xerces.internal.impl.xs.util.XInt;

import java.util.LinkedList;

public class Klass {
    private int number;
    private Student leader;
    private LinkedList<XInterface> listenerList = new LinkedList<>();
    public Klass(int _number) {
        number = _number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {return leader;}

    public void register(XInterface listener) {
        listenerList.add(listener);
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
            listenerList.stream().forEach(listener -> listener.notifyLeader(student, this));
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if(listenerList!=null)
            for(XInterface listener: listenerList){
                listener.notifyMember(student, this);
            }
    }
}