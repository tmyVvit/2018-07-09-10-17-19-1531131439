package practice12;

import java.util.LinkedList;

public class Teacher extends Person implements XInterface{
    private LinkedList<Klass> klasses = new LinkedList<Klass>();
    public Teacher(int _id, String _name, int _age) {
        super(_id, _name, _age);
    }

    public Teacher(int _id, String _name, int _age, LinkedList<Klass> _klasses) {
        super(_id, _name, _age);
        int length = _klasses.size();

        klasses.addAll(_klasses);
        for(Klass klass: klasses) {
            klass.register(this);
        }
    }

    @Override
    public String introduce() {
        StringBuilder teachOrNot;
        if(klasses.size() != 0) {
            teachOrNot = new StringBuilder("Class ");
            for(Klass klass:klasses){
                String tmp = String.valueOf((klass.getNumber()));
                teachOrNot.append(tmp);
                if(klasses.getLast()!=klass)
                    teachOrNot.append(", ");
            }
        }else {teachOrNot = new StringBuilder("No Class");}
        return super.introduce()+String.format(" I am a Teacher. I teach %s.", teachOrNot.toString());
    }

    public String introduceWith(Student student) {
        String teachOrNot = isTeaching(student)?"teach":"don't teach";

        return super.introduce()+String.format(" I am a Teacher. I %s %s.", teachOrNot, student.getName());
    }

    public LinkedList<Klass> getClasses(){return klasses;}

    public boolean isTeaching(Student student) {
        boolean isTeach = false;
        for(Klass klass: klasses) {
            if(klass.equals(student.getKlass())){
                isTeach = true;
                break;
            }
        }
        return isTeach;
    }

    @Override
    public void notifyLeader(Student student, Klass klass) {
        System.out.print(String.format("I am %s. I know %s become Leader of %s.\n", getName(), student.getName(), klass.getDisplayName()));
    }
    @Override
    public void notifyMember(Student student, Klass klass) {
        System.out.print(String.format("I am %s. I know %s has joined %s.\n", getName(), student.getName(), klass.getDisplayName()));
    }

}