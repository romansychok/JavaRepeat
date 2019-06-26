package inherAbstInterf.HomeWork;

public class Man extends Person {

        private boolean breard;

    public Man() {
    }

    public Man(String name, int age, boolean breard) {
        super(name, age);
        this.breard = breard;
    }

    public boolean isBreard() {
        return breard;
    }

    public void setBreard(boolean breard) {
        this.breard = breard;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                "breard=" + breard +
                '}';
    }
}
