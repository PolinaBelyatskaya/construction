package com.solvd.construction.models.machines;

public class Lorry {


        private String brand;
        private int pricePerHour;
        private int cargoCapacity;


        public Lorry(String brand, int pricePerHour, int cargoCapacity) {
            this.brand = brand;
            this.pricePerHour = pricePerHour;
            this.cargoCapacity = cargoCapacity;
        }

        public Lorry(String brand){

        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getPricePerHour() {
            return pricePerHour;
        }

        public void setPricePerHour(int pricePerHour) {
            this.pricePerHour = pricePerHour;
        }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}