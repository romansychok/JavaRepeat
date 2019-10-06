package inher_Abst_Interfaces.hm_inhe_abst_interf;

public class Boy extends Man implements Powerlifting {

    private String favoritePet;

    public Boy() {
    }

    public Boy(String name, int age, int weight, int height, String favoritePet) {
        super(name, age, weight, height);
        this.favoritePet = favoritePet;
    }

    public String getFavoritePet() {
        return favoritePet;
    }

    public void setFavoritePet(String favoritePet) {
        this.favoritePet = favoritePet;
    }

    @Override
    public String toString() {
        return "Boy{"  +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight() +
                ", favoritePet='" + favoritePet + '\'' +
                '}';
    }

    @Override
    public void benchPress() {
        System.out.println(180 + " kg" );
    }

    @Override
    public void champion() {

    }
}
