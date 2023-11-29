package com.solvd.construction.models.constructionengineering;

public enum Color {

    WHITE ("white"),
    BLACK ("black"),
    RAD ("rad"),
    GREEN ("green"),
    YELLOW ("yellow"),
    BLUE ("blue");

    private String color;

    Color (String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }
}
