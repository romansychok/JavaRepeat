package inher_Abst_Interfaces.inhr;

public class Son extends Father {

    private int weight;

    public Son() {
    }

    public Son(String name, int age, String job, int weight) {
        super(name, age, job);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", job='" + super.getJob() + '\'' +
                ", weight=" + weight +
                '}';
    }


    public void run(){
        System.out.println("I want to run near school");
    }
}
