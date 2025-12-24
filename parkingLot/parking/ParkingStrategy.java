package parkingLot.parking;

import parkingLot.Parking;
import parkingLot.ParkingSpot;
import parkingLot.Vehicle;

public interface ParkingStrategy {
    public ParkingSpot park(Parking parking, Vehicle vehicle);
    public void unPark(ParkingSpot parkingSpot);
}
