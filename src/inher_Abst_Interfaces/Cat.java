package inher_Abst_Interfaces;

public class Cat extends Mamal implements RocketWings,RocketBoots {

    private int numberOfLives;

    public Cat() {
    }

    public Cat(String name, int age, String skinColor, int numberOfLives) {
        super(name, age, skinColor);
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }


    @Override
    public String toString() {
        return "Cat{" +    "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", numberOfLives=" + numberOfLives +
                ", skinColor='" + skinColor + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Myau");
    }

    @Override
    public void hungry() {
        System.out.println("hungry");
    }

    public void eat(){
        super.hungry();
    }

    @Override
    public void fuel() {
        System.out.println(true);
    }

    @Override
    public void sound() {
        System.out.println("ffffffffoooooooooommmmmmmm");
    }

    @Override
    public void spin() {
        System.out.println("spin to win");

    }



}
