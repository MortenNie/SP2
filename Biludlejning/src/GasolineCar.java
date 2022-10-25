public class GasolineCar extends AFuelCar{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kilometerLitre) {
        super(registrationNumber, make, model, numberOfDoors, kilometerLitre);
    }

    public String getFuelType() {
        return "Gasoline";

    }

    public int getRegistrationFee() {
        if (kilometerLitre < 5) {
            return 10470;

        } else if (kilometerLitre < 10) {
            return 5550;


        } else if (kilometerLitre < 15) {
            return 2340;

        } else if (kilometerLitre < 20) {
            return 1050;



        } else if (kilometerLitre <= 50) {
            return 330;

        }

       else {
           return -1;

        }

    }

    public String getRegistrationNumber() {

        return registrationNumber;
    }


    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber + ", Make: " + make + ", Model: " + model + ", Number of doors: " + numberOfDoors + ", Drives pr. litre " + kilometerLitre;
    }
}
