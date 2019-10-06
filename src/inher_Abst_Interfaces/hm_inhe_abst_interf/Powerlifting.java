package inher_Abst_Interfaces.hm_inhe_abst_interf;

public interface Powerlifting {

        public static final int MAX_SQUAT = 200;

        void benchPress();

        default void champion(){
            System.out.println("Champion of World 2019");
        }

}
