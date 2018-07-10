package practice05;

public class Worker extends Person {
    private String name;
    private int age;
    public Worker(String _name, int _age){
        super(_name, _age);
    }

    public String introduce() {
        return String.format("%s I am a Worker. I have a job.", super.introduce());
    }
}