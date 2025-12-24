package parkingLot.parking;

import parkingLot.*;

import java.util.List;

public class SimpleParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot park(Parking parking, Vehicle vehicle) {
        for(ParkingFloor floor: parking.getParkingFloors()){
            for(ParkingSpot spot: floor.getParkingSpots()){
                if(spot.getVehicle()!=null) continue;
                if(canFitVehicle(spot, vehicle)){
                    spot.assignVehicle(vehicle);
                    return spot;
                }
            }
        }
        return null;
    }

    @Override
    public void unPark(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
    }

    private boolean canFitVehicle(ParkingSpot spot, Vehicle vehicle){
        return switch (spot.getSpotType()) {
            case COMPACT -> VehicleType.CAR.equals(vehicle.getVehicleType());
            case LARGE -> VehicleType.TRUCK.equals(vehicle.getVehicleType());
            case MOTORCYCLE -> VehicleType.BIKE.equals(vehicle.getVehicleType());
            default -> false;
        };
    }
}
