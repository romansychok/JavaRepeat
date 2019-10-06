package inher_Abst_Interfaces.hm_inhe_abst_interf;

public class Man extends Person{

    private int weight;
    private int height;

    public Man() {
    }

    public Man(String name, int age, int weight, int height) {
        super(name, age);
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Man{"  +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public void sport() {
        System.out.println("Gym");
    }

    @Override
    public void job() {
        System.out.println("Programmer");
    }
}
