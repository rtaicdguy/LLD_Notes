package parkingLot;

import parkingLot.parking.ParkingStrategy;
import parkingLot.ticket.PricingStrategy;
import parkingLot.ticket.Ticket;

import java.util.List;

public class Parking {
    private String parkingName;
    private List<ParkingFloor> parkingFloors;
    private PricingStrategy pricingStrategy;
    private ParkingStrategy parkingStrategy;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public String getParkingName() {
        return parkingName;
    }

    public Parking(String parkingName, List<ParkingFloor> parkingFloors, PricingStrategy pricingStrategy, ParkingStrategy parkingStrategy) {
        this.parkingName = parkingName;
        this.parkingFloors = parkingFloors;
        this.pricingStrategy = pricingStrategy;
        this.parkingStrategy = parkingStrategy;
    }

    public Ticket park(Vehicle vehicle) {
        ParkingSpot parkingSpot= parkingStrategy.park(this,vehicle);
        if(parkingSpot==null){
            throw new RuntimeException("No parking spot available for vehicle: "+vehicle.getRegistrationNumber());
        }
        return new Ticket(parkingSpot,System.currentTimeMillis());
    }

    public Integer unpark(Ticket ticket){
        Integer price=pricingStrategy.calculatePrice(ticket);
        if(price==0){
            throw new RuntimeException("Invalid Ticket");
        }
        parkingStrategy.unPark(ticket.getParkingSpot());
        return price;
    }

}
