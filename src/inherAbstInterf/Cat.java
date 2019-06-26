package inherAbstInterf;

public class Cat extends Mamal {

    private int lives;

    public Cat() {

    }

    public Cat(String name, int age, String skinColor, int lives) {
        super(name, age, skinColor);
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", lives=" + lives +
                ", skinColor='" + skinColor + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("mmmmyyyaaa");
    }

    @Override
    public void hungry() {
        System.out.println("Always Hungry");
    }

    public void hungre(){
        super.hungry();
    }

}
