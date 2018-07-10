package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String _name, int _age) {
        super(_name, _age);
    }

    public Student(String _name, int _age, Klass _klass) {
        super(_name, _age);
        klass = _klass;
    }

    public Klass getKlass() {
        return klass;
    }
    @Override
    public String introduce() {
        return super.introduce()+String.format(" I am a Student. I am at %s.", klass.getDisplayName());
    }
}
