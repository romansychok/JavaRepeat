package inherAbstInterf.HomeWork;

public abstract class Man extends Person {

    protected boolean beard;

    public Man() {
    }

    public Man(String name, int age, boolean beard) {
        super(name, age);
        this.beard = beard;
    }

    public boolean isBeard() {
        return beard;
    }

    public void setBeard(boolean beard) {
        this.beard = beard;
    }

    @Override
    public String toString() {
        return "Man{"  +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                "beard=" + beard +
                '}';
    }

    public abstract void drinkBear();

    public abstract void smoke();

}
