package inher_Abst_Interfaces.hm_inhe_abst_interf;

public class Girl extends Woman implements Dancing {

    private boolean freckles;

    public Girl() {
    }

    public Girl(String name, int age, String hairColor, String eyaColor, boolean freckles) {
        super(name, age, hairColor, eyaColor);
        this.freckles = freckles;
    }

    public boolean isFreckles() {
        return freckles;
    }

    public void setFreckles(boolean freckles) {
        this.freckles = freckles;
    }

    @Override
    public String toString() {
        return "Girl{"  +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", hairColor='" + super.getHairColor() + '\'' +
                ", eyaColor='" + super.getEyaColor() + '\'' +
                ", freckles=" + freckles +
                '}';
    }

    @Override
    public void favoriteCity() {
        System.out.println("Barcelona");
    }

    @Override
    public void happy() {

    }
}
