package pro.sky;

public class ServiceStation implements Checking {
    @Override
    public void check(Bicycle bicycle) {
        Checking.super.check(bicycle);
    }

    @Override
    public void check(Car car) {
        Checking.super.check(car);
    }

    @Override
    public void check(Truck truck) {
        Checking.super.check(truck);
    }
}
