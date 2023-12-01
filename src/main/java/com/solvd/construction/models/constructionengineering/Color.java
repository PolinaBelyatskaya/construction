package com.solvd.construction.models.constructionengineering;

public enum Color {

    WHITE("white"),
    BLACK("black"),
    RAD("rad"),
    GREEN("green"),
    YELLOW("yellow"),
    BLUE("blue");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
