package city;

public class Home extends Building {

    public static final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(int area, int level, Address address) {
        super(area, level, address);
        if(level > 3){
            throw new IllegalArgumentException("Levels must be equal or less than three");
        }
    }

    public Home(int area, Address address) {
        super(area, address);
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return getFullArea() / SQUARE_METERS_NEED_PER_PERSON;
    }
}
