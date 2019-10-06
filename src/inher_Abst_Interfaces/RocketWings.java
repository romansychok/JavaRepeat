package inher_Abst_Interfaces;

public interface RocketWings {

    public static final int WINGS_SPEED = 300;

    void sound();

    default void turboSpeed(){
        System.out.println("TURBOOOOOOOO");
    }



}
