public class ElectricCar extends ACar{

    int batteryCapacity;
    int maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getRegistrationFee() {
        float result = (float) (getWhPrKm()/91.25)/100;

        if (result < 5) {
            return 10470;

        } else if (result < 10) {
            return 5550;


        } else if (result < 15) {
            return 2340;

        } else if (result < 20) {
            return 1050;



        } else if (result <= 50) {
            return 330;

        }

        else {
            return -1;

        }


    }

    public int getWhPrKm() {

        return batteryCapacity/maxRangeKm;

    }
    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber + ", Make: " + make + ", Model: " + model + ", Number of doors: " + numberOfDoors + ", watt pr. km: " + getWhPrKm();
    }


}
