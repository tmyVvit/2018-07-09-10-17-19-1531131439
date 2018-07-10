package practice07;

public class Klass {
    private int number;
    public Klass(int _number) {
        number = _number;
    }

    public int getNumber() {
        return number;
    }

    public boolean equals(Klass _klass) {
        return number==_klass.getNumber();
    }

    public String getDisplayName(){
        return String.format("Class %d", number);
    }
}
