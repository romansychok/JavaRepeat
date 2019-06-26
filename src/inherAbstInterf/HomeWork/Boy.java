package inherAbstInterf.HomeWork;

public class Boy extends Man implements Hobbies,University {

    public int numberOfSchool;

    public Boy() {
    }

    public Boy(String name, int age, boolean beard, int numberOfSchool) {
        super(name, age, beard);
        this.numberOfSchool = numberOfSchool;
    }

    public int getNumberOfSchool() {
        return numberOfSchool;
    }

    public void setNumberOfSchool(int numberOfSchool) {
        this.numberOfSchool = numberOfSchool;
    }

    @Override
    public String toString() {
        return "Boy{"  +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                " numberOfSchool=" + numberOfSchool +
                ", beard=" + beard +
                '}';
    }

    @Override
    public void drinkBear() {
        System.out.println("After hard day in school I drink a cold beer");
    }

    @Override
    public void smoke() {
        System.out.println("Real man dont smoke!!!");
    }

    @Override
    public void goToGym() {
        System.out.println("I like visiting a Gym");
    }

    @Override
    public void eat() {
        System.out.println("I need more food");
    }

    @Override
    public void specialization() {
        System.out.println("International information");
    }


}
