package city;

import java.util.ArrayList;
import java.util.List;

public class City {

    private final long fullArea;
    private final String name;
    private List<Building> buildings = new ArrayList<>();

    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public long getFullArea() {
        return fullArea;
    }

    public String getName() {
        return name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        long currentArea = 0;
        for (Building actual : buildings){
            currentArea += actual.getArea();
        }
        if(currentArea + building.getArea() <= fullArea){
            buildings.add(building);
        }else {
            throw new IllegalArgumentException("City can't be larger than " + fullArea);
        }
    }

    public Building findHighestBuilding() {
        if(buildings.size() == 0){
            throw new IllegalStateException("No buildings");
        }
        Building result = buildings.get(0);
        for(Building actual : buildings){
            if (actual.getLevels() > result.getLevels()){
              result = actual;
            }
        }
        return result;
    }

    public List<Building> findBuildingsByStreet(String street) {
        List<Building> result = new ArrayList<>();
        for(Building actual : buildings){
            if(actual.getAddress().getStreet().equals(street)){
                result.add(actual);
            }
        }
        return result;
    }

    public boolean isThereBuildingWithMorePeopleThan(int numberOfPeople) {
        for(Building actual : buildings){
            if(actual.calculateNumberOfPeopleCanFit() > numberOfPeople){
                return true;
            }
        }
        return false;
    }

}
