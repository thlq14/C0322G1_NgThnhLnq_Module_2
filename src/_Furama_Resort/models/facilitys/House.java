package _Furama_Resort.models.facilitys;

public class House extends Facility {
    private String standardHouse;
    private int floorHouse;

    public House() {
    }

    public House(String standardHouse, int floorHouse) {
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHouse, int floorHouse) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getIdFacility(), super.getNameService(), super.getAreaUse(),
                super.getRentalPrice(), super.getRentalPeopleMax(), super.getStyleRental(),
                this.getStandardHouse(), this.getFloorHouse());
    }

    @Override
    public String toString() {
        return "House {" + super.toString() +
                ", standardHouse = '" + standardHouse + '\'' +
                ", floorHouse = " + floorHouse +
                '}';
    }
}
