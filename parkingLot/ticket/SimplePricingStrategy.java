package parkingLot.ticket;

import parkingLot.ParkingSpot;
import parkingLot.SpotType;

public class SimplePricingStrategy implements PricingStrategy {
    private final Integer RATE_PER_HOUR = 10;

    @Override
    public Integer calculatePrice(Ticket ticket) {
        ParkingSpot parkingSpot=ticket.getParkingSpot();
        Long entryTime= ticket.getEntryTime();
        Long currentTime = System.currentTimeMillis();

        System.out.println("Difference: " + (currentTime - entryTime));

        Long durationInHours = (currentTime - entryTime) / (1000);
        System.out.println("Duration in hours: " + durationInHours);
        Integer multiplier = getMultiplier(parkingSpot.getSpotType());
        System.out.println("Multiplier: " + multiplier);
        return RATE_PER_HOUR * durationInHours.intValue() * multiplier;
    }

    private Integer getMultiplier(SpotType spotType) {
        switch (spotType) {
            case COMPACT:
                return 2;
            case LARGE:
                return 4;
            case MOTORCYCLE:
                return 1;
        }
        return 0;
    }
}
