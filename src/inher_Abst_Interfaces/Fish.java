package inher_Abst_Interfaces;

public abstract class Fish extends Animal {

    private String type;

    public Fish() {
    }

    public Fish(String type) {
        this.type = type;
    }

    public Fish(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + super.getName()+ '\'' +
                ", age=" + super.getAge() +
                " type='" + type + '\'' +
                '}';
    }

    public void breathUnderWater(){
        System.out.println("can breath under water");
    }

}
