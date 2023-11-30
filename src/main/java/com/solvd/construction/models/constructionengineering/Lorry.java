package com.solvd.construction.models.constructionengineering;

public class Lorry extends ConstructionEngineering {

    public Lorry (String brand, Color color, float cargoCapacity, float pricePerHour, int weight){
        super(brand, color, cargoCapacity, pricePerHour, weight);
    }
    public Lorry (String brand, float cargoCapacity, int weight){
        super(brand, cargoCapacity, weight);
    }

}
