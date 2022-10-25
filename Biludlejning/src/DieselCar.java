public class DieselCar extends AFuelCar {
     boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kilometerLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kilometerLitre);
        this.particleFilter = particleFilter;
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

        if (kilometerLitre < 5) {
            return 10470 + hasParticleFilter();

        } else if (kilometerLitre < 10) {
            return 5550 + hasParticleFilter();


        } else if (kilometerLitre < 15) {
            return 2340 + hasParticleFilter();

        } else if (kilometerLitre < 20) {
            return 1050 + hasParticleFilter();



        } else if (kilometerLitre <= 50) {
            return 330 + hasParticleFilter();

        }

        else {
            return -1;

        }

    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public int hasParticleFilter() {
        if (particleFilter == true) {
            return 0;
        } else  {
            return 1000;

        }


    }

    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber + ", Make: " + make + ", Model: " + model + ", Number of doors: " + numberOfDoors + ", Drives pr. litre " + kilometerLitre + ", Does it have a particle filter? " + particleFilter;
    }
}


