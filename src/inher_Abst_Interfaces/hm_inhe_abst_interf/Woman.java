package inher_Abst_Interfaces.hm_inhe_abst_interf;

public class Woman extends Person {

    private String hairColor;
    private String eyaColor;

    public Woman() {
    }

    public Woman(String name, int age, String hairColor, String eyaColor) {
        super(name, age);
        this.hairColor = hairColor;
        this.eyaColor = eyaColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyaColor() {
        return eyaColor;
    }

    public void setEyaColor(String eyaColor) {
        this.eyaColor = eyaColor;
    }

    @Override
    public String toString() {
        return "Woman{"  +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", hairColor='" + hairColor + '\'' +
                ", eyaColor='" + eyaColor + '\'' +
                '}';
    }

    @Override
    public void sport() {
        System.out.println("run");
    }

    @Override
    public void job() {
        System.out.println("Project manager");
    }
}
