package inherAbstInterf;

public abstract class Mamal extends Animal {

    protected String skinColor;

    public Mamal() {
    }

    public Mamal(String name, int age, String skinColor) {
        super(name, age);
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "Mamal{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", skinColor='" + skinColor + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Give me back my passport");
    }

    @Override
    public void hungry() {
        super.hungry();
    }
}
