package practice08;

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

    public boolean equals(Klass _klass) {
        return number==_klass.getNumber();
    }

    public String getDisplayName(){
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if(equals(student.getKlass())){
            leader = student;
        }
    }
}