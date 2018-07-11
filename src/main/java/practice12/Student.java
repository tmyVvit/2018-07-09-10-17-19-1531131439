package practice12;

public class Student extends Person{
    private Klass klass;

    public Student(int _id, String _name, int _age) {
        super(_id, _name, _age);
    }

    public Student(int _id, String _name, int _age, Klass _klass) {
        super(_id, _name, _age);
        klass = _klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass _klass) {
        klass = _klass;
    }
    @Override
    public String introduce() {
        String leaderOrNot = "at";
        if(equals(klass.getLeader()))
            leaderOrNot = "Leader of";
        return super.introduce()+String.format(" I am a Student. I am %s %s.",leaderOrNot, klass.getDisplayName());
    }

}

