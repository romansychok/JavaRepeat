package inherAbstInterf;

public class Kitten extends Cat implements RocketWings, RocketBoots{

    private String klikuha;

    public Kitten() {
    }

    public Kitten(String name, int age, String skinColor, int lives, String klikuha) {
        super(name, age, skinColor, lives);
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
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", lives=" + super.getLives()+
                ", skinColor=" + skinColor + '\'' +
                ", klikuha='" + klikuha +
                '}';
    }

    @Override
    public void hungry() {
        System.out.println("Cat drink milk");
    }

    public void scream(){
        System.out.println("sfafasfa");
    }

    @Override
    public void fuel() {
        System.out.println(true);
    }

    @Override
    public void sound() {
        System.out.println("Yarik blyat");
    }

    @Override
    public void spin() {
        System.out.println("spin to WIN!!!");
    }
}
