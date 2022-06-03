package _Furama_Resort.models.facilitys;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getIdFacility(), super.getNameService(), super.getAreaUse(),
                super.getRentalPrice(), super.getRentalPeopleMax(), super.getStyleRental(),
                this.getFreeService());
    }

    @Override
    public String toString() {
        return "Room {" + super.toString() +
                ", freeService = '" + freeService + '\'' +
                '}';
    }
}
