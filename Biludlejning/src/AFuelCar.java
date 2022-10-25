public abstract class AFuelCar extends ACar {



    int kilometerLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kilometerLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kilometerLitre = kilometerLitre;
    }

    public abstract String getFuelType();

    public int kmPrLitre() {

        return kilometerLitre;
    }
}
