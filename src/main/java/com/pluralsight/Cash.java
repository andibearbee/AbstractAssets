package com.pluralsight;

public class Cash extends Assets {    public Cash(String dateAcquired, String description, double originalCost) {
    super(dateAcquired, description, originalCost);
}
    public double getValue() {
        return originalCost;
    }
}


