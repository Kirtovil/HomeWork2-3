package pro.sky;

public abstract class Vehicle {
    protected String modelName;
    protected int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }
}
