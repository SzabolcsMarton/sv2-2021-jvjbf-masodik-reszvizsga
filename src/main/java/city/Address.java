package city;

public class Address {

    private final String street;
    private final int buildingNumber;

    public Address(String street, int buildingNumber) {
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return this.street;
    }

    public int getBuildingNumber() {
        return this.buildingNumber;
    }
}
