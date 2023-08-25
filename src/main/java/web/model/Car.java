package web.model;

public class Car {

    private int serialNumber;
    private String model;
    private int series;

    public Car(int serialNumber, String model, int series) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
