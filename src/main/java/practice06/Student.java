package practice06;

public class Student extends Person {
    private int klass;

    public Student(String _name, int _age){
        super(_name, _age);
    }
    public Student(String _name, int _age, int _klass) {
        super(_name, _age);
        klass = _klass;
    }

    public String introduce() {
        return String.format("%s I am a Student. I am at Class %d.", super.introduce(), klass);
    }

    public int getKlass() {
        return klass;
    }
}