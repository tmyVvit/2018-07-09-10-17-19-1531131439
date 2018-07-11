package practice12;

import java.util.LinkedList;

public class Computer implements XInterface {
    private LinkedList<Klass> klasses = new LinkedList<Klass>();

    public Computer(LinkedList<Klass> _klasses) {
        for (Klass klass: _klasses) {
            klasses.add(klass);
            klass.register(this);
        }
    }
    @Override
    public void notifyLeader(Student student, Klass klass) {
        System.out.print(String.format("I am the Machine. I know %s become Leader of %s.\n", student.getName(), klass.getDisplayName()));
    }

    @Override
    public void notifyMember(Student student, Klass klass) {
        System.out.print(String.format("I am the Machine. I know %s has joined %s.\n", student.getName(), klass.getDisplayName()));
    }
}
