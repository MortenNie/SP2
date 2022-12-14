import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      FleetOfCars f1 = new FleetOfCars(new ArrayList<>());
      GasolineCar c1 = new GasolineCar("A277", "Audi", "A6",4, 50 );
      DieselCar c2 = new DieselCar("B777", "Ford", "H10", 2, 15, false);
      ElectricCar c3 = new ElectricCar("C999", "Tesla", "M26", 4, 400000, 1);
      f1.addCarToFleet(c1);
      f1.addCarToFleet(c2);
      f1.addCarToFleet(c3);
      System.out.println(f1);
      float result = f1.getTotalRegistrationFeeForFleet();
      System.out.println(result);
    }
}