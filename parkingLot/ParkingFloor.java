package parkingLot;

import java.util.List;

public class ParkingFloor {
    private final String floorId;
    private final Integer floorNumber;
    private final List<ParkingSpot> parkingSpots;

    public ParkingFloor(String floorId, Integer floorNumber, List<ParkingSpot> parkingSpots) {
        this.floorId = floorId;
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpots.add(parkingSpot);
    }

    public String getFloorId() {
        return floorId;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
