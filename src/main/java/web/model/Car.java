package web.model;

public class Car {
    private int id;
    private String model;
    private int number;

    public Car(int id, String model, int number) {
        this.id = id;
        this.model = model;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
