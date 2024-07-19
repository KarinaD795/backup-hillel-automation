package ua.hillel.lessons.lesson13.enums;

public enum BorderMenu {

    MAIN ("ft"),
    PRODUCTS ("m"),
    CONTACTS ("in");

    BorderMenu(String meassure) {
        this.meassure = meassure;
    }

    String meassure;

}
