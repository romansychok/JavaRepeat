package inher_Abst_Interfaces.inhr;

public class Father extends Person{

    private String job;

    public Father() {
    }

    public Father(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", job='" + job + '\'' +
                '}';
    }
}
