package prototype;

public class Building extends Graphic {

    private BuildingType buildingType;

    public Building(int heightInPixels, BuildingType buildingType) {
        super(heightInPixels);
        this.buildingType = buildingType;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }


    @Override
    public Building clone() {
        return new Building(this.getHeightInPixels(), new BuildingType(this.buildingType.getType()));
    }

    @Override
    public String toString() {
        return "Building{" +
                "heightInPixels=" + this.getHeightInPixels() +
                "buildingType=" + buildingType +
                '}';
    }
}
