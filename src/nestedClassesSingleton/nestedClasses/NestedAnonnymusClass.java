package nestedClassesSingleton.nestedClasses;


interface Message {
    String message();
}

//abstract class A {
//    public abstract void word();
//}


public class NestedAnonnymusClass {

//        A a = new A() {
//            @Override
//            public void word() {
//                System.out.println("Annon class hello");
//            }
//        };

    public void showMessage(Message m){
        System.out.println(m.message() + " and a bottle rum");
    }

    public void call(){
        NestedAnonnymusClass nestedAnonnymusClass = new NestedAnonnymusClass();
        nestedAnonnymusClass.showMessage(new Message() {
            @Override
            public String message() {
                return "Yohoho ";
            }
        });
    }



}


