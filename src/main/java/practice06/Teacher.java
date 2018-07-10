package practice06;

public class Teacher extends Person{
    private int klass;
    public Teacher(String _name, int _age) {
        super(_name, _age);
    }
    public Teacher(String _name, int _age, int _klass) {
        super(_name, _age);
        klass = _klass;
    }

    public int getKlass(){
        return klass;
    }

    public String introduce() {
        String teachOrNot = "No Class";
        if(klass != 0){
            teachOrNot = String.format("Class %d", klass);
        }
        return String.format("%s I am a Teacher. I teach %s.", super.introduce(), teachOrNot);
    }

}
