public abstract class ACar implements Car {

     String registrationNumber;
     String make;
     String model;
     int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public abstract String getRegistrationNumber();

    public abstract String getMake();

    public abstract String getModel();

    public abstract int getNumberOfDoors();







}
