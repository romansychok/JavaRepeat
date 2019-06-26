package inherAbstInterf.HomeWork;

public interface University {

    String Univer = "NULP";

    void specialization();

    default void favoriteLesson(){
        System.out.println("Sleep(((");
    }


}
