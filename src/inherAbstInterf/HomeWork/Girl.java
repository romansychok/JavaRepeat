package inherAbstInterf.HomeWork;

public class Girl extends Woman implements Hobbies, University {

    public boolean doGirlLikeDance;

    public Girl() {
    }

    public Girl(String name, int age, boolean longHair, boolean doGirlLikeDance) {
        super(name, age, longHair);
        this.doGirlLikeDance = doGirlLikeDance;
    }

    public boolean isDoGirlLikeDance() {
        return doGirlLikeDance;
    }

    public void setDoGirlLikeDance(boolean doGirlLikeDance) {
        this.doGirlLikeDance = doGirlLikeDance;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                " doGirlLikeDance=" + doGirlLikeDance +
                ", longHair=" + longHair +
                '}';
    }

    @Override
    public void doSheHaveInst() {
        System.out.println("Yes she have Instagram");
    }

    @Override
    public void drinkVine() {
        System.out.println("Yes she like drink a vine");
    }

    @Override
    public void goToGym() {
        System.out.println("often I like go and work out");
    }

    @Override
    public void eat() {
        System.out.println("Where is my hamburger???!!!");
    }

    @Override
    public void specialization() {
        System.out.println("Law");
    }

    @Override
    public void favoriteLesson() {
        System.out.println("Stay at Home");
    }
}
