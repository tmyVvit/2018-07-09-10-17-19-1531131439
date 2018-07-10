package practice01;

public class Person {
    private String name;
    private int age;
    public Person(String _name, int _age) {
        name = _name;
        age = _age;
    };
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old.", name, age);
    }
}
