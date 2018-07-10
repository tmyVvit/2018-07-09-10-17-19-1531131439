package practice08;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int _id, String _name, int _age) {
        super(_id, _name, _age);
    }

    public Teacher(int _id, String _name, int _age, Klass _klass) {
        super(_id, _name, _age);
        klass = _klass;
    }

    @Override
    public String introduce() {
        String teachOrNot = klass == null?"No Class":klass.getDisplayName();
        return super.introduce()+String.format(" I am a Teacher. I teach %s.", teachOrNot);
    }

    public String introduceWith(Student student) {
        String teachOrNot = klass.equals(student.getKlass())?"teach":"don't teach";
        return super.introduce()+String.format(" I am a Teacher. I %s %s.", teachOrNot, student.getName());
    }

    public Klass getKlass(){return klass;}
}