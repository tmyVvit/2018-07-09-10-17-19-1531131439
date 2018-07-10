package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klasses;
    public Teacher(int _id, String _name, int _age) {
        super(_id, _name, _age);
    }

    public Teacher(int _id, String _name, int _age, LinkedList<Klass> _klasses) {
        super(_id, _name, _age);
        int length = _klasses.size();
        klasses = new LinkedList();
        for(Klass klass:_klasses) {
            klasses.add(klass);
        }
    }

    @Override
    public String introduce() {
        String teachOrNot = "No Class";
        if(klasses != null) {
            teachOrNot = "Class ";
            for(Klass klass:klasses){
                String tmp = String.valueOf((klass.getNumber()));
                teachOrNot+= tmp;
                if(klasses.getLast()!=klass)
                    teachOrNot+= ", ";
            }
        }
        return super.introduce()+String.format(" I am a Teacher. I teach %s.", teachOrNot);
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
    
}