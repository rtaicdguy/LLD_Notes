package parkingLot.ticket;

import parkingLot.SpotType;

public interface PricingStrategy {
    public Integer calculatePrice(Ticket ticket);
}
