package practice12;

public class Person {
    private int id;
    private String name;
    private int age;
    public Person(int _id, String _name, int _age) {
        id = _id;
        name = _name;
        age = _age;
    };
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId() {return id;}
    public String introduce(){
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person person = (Person) obj;
            return id == person.getId();
        }
        return super.equals(obj);
    }
}
