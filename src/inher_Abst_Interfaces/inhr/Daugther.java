package inher_Abst_Interfaces.inhr;

public class Daugther extends Father {

    private String hairColor;

    public Daugther() {
    }

    public Daugther(String name, int age, String job, String hairColor) {
        super(name, age, job);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Daugther{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", job='" + super.getJob() + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
