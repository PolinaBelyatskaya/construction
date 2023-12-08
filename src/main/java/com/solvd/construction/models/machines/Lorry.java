package com.solvd.construction.models.machines;

public class Lorry extends Machine{

        private int cargoCapacity;


        public Lorry(String brand, int pricePerHour, int cargoCapacity) {
            super (brand, pricePerHour);
            this.cargoCapacity = cargoCapacity;
        }

        public Lorry(String brand){
            super(brand);

        }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}