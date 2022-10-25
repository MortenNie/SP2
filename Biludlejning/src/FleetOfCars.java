import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> cars;

    public FleetOfCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

   public int  getTotalRegistrationFeeForFleet() {
        int sum = 0;
        for (int i = 0; i < cars.size(); i++) {
           sum += cars.get(i).getRegistrationFee();

        }
        return sum;

    }

    public void addCarToFleet(Car c) {
        cars.add(c);


    }

    public String toString() {
         String results =  "";
        for (int i = 0; i < cars.size(); i++) {
           results += cars.get(i).toString() + "\n";

        }
        return results;

    }

}
