package inherAbstInterf;

public interface RocketWings {

    public static final int WINGS_SPEED = 300;

    public abstract void sound();

    default void turbo(){
        System.out.println("Super power");
    }

}
