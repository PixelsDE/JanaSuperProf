package eins;

public class Instructor extends Person{


    public Instructor(String name, int age, String tumID) {
        super(name, age, tumID);
    }

    public void teach(String text){
        say("Please learn <" +text+">");
    }
}
