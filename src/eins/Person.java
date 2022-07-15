package eins;

public class Person {

    private final String name;
    private final int age;
    private final String tumID;

    public Person(String name, int age, String tumID) {
        this.name = name;
        this.age = age;
        this.tumID = tumID;
    }

    public void say(String text) {
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
