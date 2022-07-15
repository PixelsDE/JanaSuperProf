package drei;

public abstract class TemperatureGUI implements Observer {


    public TemeratureModel model;

    public TemperatureGUI(TemeratureModel model) {
        this.model = model;
    }


    public TemeratureModel getModel() {
        return model;
    }

    public void setModel(TemeratureModel model) {
        this.model = model;
    }
}
