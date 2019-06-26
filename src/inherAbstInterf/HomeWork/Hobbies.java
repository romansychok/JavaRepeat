package inherAbstInterf.HomeWork;

public interface Hobbies {

    String HOBBIE = "Sleep";

    void goToGym();

    default void  eat(){
        System.out.println("I like MCdonalds");
    }

}
