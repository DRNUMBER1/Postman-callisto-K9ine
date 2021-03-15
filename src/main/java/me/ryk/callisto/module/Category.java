package me.ryk.callisto.module;

public enum Category {
    PVP("Pvp"), EXPLOITS("Exploits"), RENDER("Render"), PLAYER("Player"), CLIENT("Client");
    public String name;
    public int moduleIndex;

    Category(String name) {
        this.name = name;
    }
}
