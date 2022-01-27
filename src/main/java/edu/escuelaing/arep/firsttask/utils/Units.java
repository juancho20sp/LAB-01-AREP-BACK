package edu.escuelaing.arep.firsttask.utils;

public enum Units {
    Celsius("CELSIUS"),
    Fahrenheit("FAHRENHEIT");

    private String displayName;

    Units(String displayName) {
        this.displayName = displayName;
    }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return this.displayName; }
}
