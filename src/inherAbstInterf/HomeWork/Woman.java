package inherAbstInterf.HomeWork;

public abstract class Woman extends Person {

    protected boolean longHair;

    public Woman() {
    }

    public Woman(String name, int age, boolean longHair) {
        super(name, age);
        this.longHair = longHair;
    }

    public boolean isLongHair() {
        return longHair;
    }

    public void setLongHair(boolean longHair) {
        this.longHair = longHair;
    }

    @Override
    public String toString() {
        return "Woman{"  +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                "longHair=" + longHair +
                '}';
    }

    public abstract void doSheHaveInst();

    public abstract void drinkVine();

}
