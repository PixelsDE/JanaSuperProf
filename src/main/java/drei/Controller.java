package drei;

import java.util.List;

public class Controller {

    public ElevatorState state;
    private int currentFloor;
    private List<Integer> pool;

    public Controller(int currentFloor, List<Integer> pool) {
        this.currentFloor = currentFloor;
        this.pool = pool;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public List<Integer> getPool() {
        return pool;
    }

    public void setPool(List<Integer> pool) {
        this.pool = pool;
    }

    public void request(int floor) {

    }

    public void signal(int zahl) {

    }

    public int getNextStop() {
        return 0;
    }

    public int getCurrentfloor() {
        return 0;
    }

}
