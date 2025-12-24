package parkingLot;

public class
ParkingSpot {
    private final String spotId;
    private final SpotType spotType;
    private Vehicle vehicle;

    ParkingSpot(String spotId, SpotType spotType){
        this.spotId=spotId;
        this.spotType=spotType;
    }

    public String getSpotId() {
        return spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }
    public void assignVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void removeVehicle(){
        this.vehicle=null;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }
}
