package inher_Abst_Interfaces.hm_inhe_abst_interf;

public interface Dancing {

    public static final String TYPE_OF_DANCE = "CHA-CHA_CHA";

    void favoriteCity();


    default void happy(){
        System.out.println("I'm Happy))))");
    }

}
