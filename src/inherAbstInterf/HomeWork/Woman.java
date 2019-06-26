package inherAbstInterf.HomeWork;

public class Woman extends Person {

    private boolean boobs;

    public Woman() {
    }

    public Woman(String name, int age, boolean boobs) {
        super(name, age);
        this.boobs = boobs;
    }

    public boolean isBoobs() {
        return boobs;
    }

    public void setBoobs(boolean boobs) {
        this.boobs = boobs;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                "boobs=" + boobs +
                '}';
    }
}
