package inher_Abst_Interfaces;

public class Kitten extends Cat {

    private String klikuha;

    public Kitten() {
    }

    public Kitten(String name, int age, String skinColor, int numberOfLives, String klikuha) {
        super(name, age, skinColor, numberOfLives);
        this.klikuha = klikuha;
    }

    public String getKlikuha() {
        return klikuha;
    }

    public void setKlikuha(String klikuha) {
        this.klikuha = klikuha;
    }

    @Override
    public String toString() {
        return "Kitten{" +    "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", numberOfLives=" + super.getNumberOfLives()+
                ", skinColor='" + skinColor + '\'' +
                "klikuha='" + klikuha + '\'' +
                '}';
    }

    @Override
    public void hungry() {
        System.out.print("Kitten drink milk");
    }

    public void scream(){

    }

}
