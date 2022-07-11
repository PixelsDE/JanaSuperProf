package eins;

public class Person {

    private String name;
    private int age;
    private String tumID;

    public Person(String name, int age, String tumID) {
        this.name = name;
        this.age = age;
        this.tumID = tumID;
    }

    public void say(String text){
        System.out.println(text);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTumID() {
        return tumID;
    }
}
