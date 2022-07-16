package drei;

public abstract class TemeratureModel extends Subject<TemeratureModel> {


    private double celsiusTemperature;

    public TemeratureModel(double celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }


    public void setC(double celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    public void setF(double fahrenheitTemperature) {
        this.celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;
    }

    public void increaseC(double celsiusTemperature) {
        this.celsiusTemperature += celsiusTemperature;
    }

    public void increaseF(double fahrenheitTemperature) {
        this.celsiusTemperature += (fahrenheitTemperature - 32) * 5 / 9;
    }

    public double getCelsiusTemperature() {
        return celsiusTemperature;
    }

    public void setCelsiusTemperature(double celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public void onUpdate(Object UNBEKANNT) {

    }

    public abstract void increaseK(double kelvinTemperature);

    public abstract void setK(double kelvinTemperature);
}
