public class Immutability {
    private final Dimensions dimensions;
    private final double mass;
    private String deliveryAddress;
    private final boolean canFlip;
    private final String registrationNumber;
    private final boolean fragile;
    public Immutability(Dimensions dimensions, double mass, String deliveryAddress, boolean canFlip, String registrationNumber, boolean fragile) {
        this.dimensions = new Dimensions(dimensions.width(), dimensions.height(), dimensions.length());
        this.mass = mass;
        this.deliveryAddress = deliveryAddress;
        this.canFlip = canFlip;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return new Dimensions(dimensions.width(), dimensions.height(), dimensions.length());
    }

    public double getMass() {
        return mass;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Immutability updateDeliveryAddress(String newAddress) {
        return new Immutability(dimensions, mass, newAddress, canFlip, registrationNumber, fragile);
    }

    public Immutability updateDimensions(Dimensions newDimensions) {
        return new Immutability(newDimensions, mass, deliveryAddress, canFlip, registrationNumber, fragile);
    }

    public Immutability updateMass(double newMass) {
        return new Immutability(dimensions, newMass, deliveryAddress, canFlip, registrationNumber, fragile);
    }

    public boolean canFlip() {
        return canFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }
}

record Dimensions(double width, double height, double length) {

    public double calculateVolume() {
        return width * height * length;
    }
}