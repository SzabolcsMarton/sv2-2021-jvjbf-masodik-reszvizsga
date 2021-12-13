package city;

public abstract class Building {

    private final int area;
    private final int level;
    private final Address address;

    public Building(int area, int level, Address address) {

        this.area = area;
        this.level = level;
        this.address = address;
    }

    public Building(int area, Address address){
        this(area,1,address);
    }

    public int getFullArea(){
        return area * level;
    }

    public abstract int calculateNumberOfPeopleCanFit();

    public int getLevels() {
        return level;
    }

    public Address getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }
}
