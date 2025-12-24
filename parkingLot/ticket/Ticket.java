package parkingLot.ticket;

import parkingLot.ParkingSpot;

public class Ticket {
    ParkingSpot parkingSpot;
    Long entryTime;

    public Ticket(ParkingSpot parkingSpot, Long entryTime) {
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Long getEntryTime() {
        return entryTime;
    }
}
