package practice10;

public class Klass {
    private int number;
    private Student leader;
    public Klass(int _number) {
        number = _number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {return leader;}

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass){
            Klass klass = (Klass) obj;
            return number==klass.getNumber();
        }
        return super.equals(obj);
    }

    public String getDisplayName(){
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if(equals(student.getKlass())){
            leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {

    }
}
