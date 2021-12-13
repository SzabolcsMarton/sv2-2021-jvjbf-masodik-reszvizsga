package city;

public class Office extends Building{

    private String company;
    private int numberOfTables;

    public Office(int area, int level, Address address, String company, int numberOfTables) {
        super(area, level, address);
        this.company = company;
        this.numberOfTables = numberOfTables;
        int areaPerTable = area / numberOfTables;
        if(areaPerTable < 2 || areaPerTable > 5){
            throw new IllegalArgumentException("Bad table count");
        }
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return numberOfTables * (getLevels() - 1);
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTables;
    }
}
