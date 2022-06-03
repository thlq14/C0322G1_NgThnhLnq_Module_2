package _Furama_Resort.models.facilitys;

public class Villa extends Facility {
    private String standardVilla;
    private double areaPool;
    private int floorVilla;

    public Villa() {
    }

    public Villa(String standardVilla, double areaPool, int floorVilla) {
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floorVilla = floorVilla;
    }

    public Villa(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floorVilla) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floorVilla = floorVilla;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getIdFacility(), super.getNameService(), super.getAreaUse(),
                super.getRentalPrice(), super.getRentalPeopleMax(), super.getStyleRental(),
                this.getStandardVilla(), this.getAreaPool(), this.getFloorVilla());
    }

    @Override
    public String toString() {
        return "Villa {" + super.toString() +
                ", standardVilla = '" + standardVilla + '\'' +
                ", areaPool = " + areaPool +
                ", floorVilla = " + floorVilla +
                '}';
    }
}
