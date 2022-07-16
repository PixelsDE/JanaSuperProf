package drei;

public abstract class Subject<T> implements Observer {


    public void addObserver(Observer<T> observer) {
    }

    public void removeObserver(Observer<T> observer) {
    }

    protected void notifyObserver(T t) {

    }
}
