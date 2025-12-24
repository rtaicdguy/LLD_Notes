package parkingLot;

import parkingLot.parking.ParkingStrategy;
import parkingLot.parking.SimpleParkingStrategy;
import parkingLot.ticket.PricingStrategy;
import parkingLot.ticket.SimplePricingStrategy;
import parkingLot.ticket.Ticket;

import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Parking parking=getParking();
        Vehicle vehicle1=new Vehicle("KA-01-HH-1234", VehicleType.CAR);
        Vehicle vehicle2=new Vehicle("KA-01-HH-9999", VehicleType.TRUCK);
        Vehicle vehicle3=new Vehicle("KA-01-BB-0001", VehicleType.BIKE);
        Vehicle vehicle4=new Vehicle("KA-01-HH-7777", VehicleType.CAR);
        Vehicle vehicle5=new Vehicle("KA-01-HH-2701", VehicleType.TRUCK);
        Vehicle vehicle6=new Vehicle("KA-01-HH-3141", VehicleType.BIKE);
        Vehicle vehicle7=new Vehicle("KA-01-P-333", VehicleType.CAR);
        Vehicle vehicle8=new Vehicle("DL-12-AA-9999", VehicleType.TRUCK);
        Vehicle vehicle9=new Vehicle("DL-12-AA-0001", VehicleType.BIKE);
        Vehicle vehicle10=new Vehicle("MH-04-AY-1111", VehicleType.CAR);

        Ticket ticket1=parking.park(vehicle1);
        Ticket ticket2=parking.park(vehicle2);
        Ticket ticket3=parking.park(vehicle3);
        Ticket ticket4=parking.park(vehicle4);
        Ticket ticket5=parking.park(vehicle5);
        Ticket ticket6=parking.park(vehicle6);
        Ticket ticket7=parking.park(vehicle7);
        Ticket ticket8=parking.park(vehicle8);
        Ticket ticket9=parking.park(vehicle9);
        //Ticket ticket10=parking.park(vehicle10); // No parking spot available, sorry :(

        Thread.sleep(2000); // Simulate parking duration

        Integer price=parking.unpark(ticket1);

        Ticket ticket11=parking.park(vehicle10);// Now there is a spot available

        System.out.println("Price: "+price);
    }

    private static Parking getParking() {
        ParkingSpot parkingSpot1=new ParkingSpot("123", SpotType.COMPACT);
        ParkingSpot parkingSpot2=new ParkingSpot("124", SpotType.LARGE);
        ParkingSpot parkingSpot3=new ParkingSpot("125", SpotType.MOTORCYCLE);
        ParkingSpot parkingSpot4=new ParkingSpot("126", SpotType.COMPACT);
        ParkingSpot parkingSpot5=new ParkingSpot("127", SpotType.LARGE);
        ParkingSpot parkingSpot6=new ParkingSpot("128", SpotType.MOTORCYCLE);
        ParkingSpot parkingSpot7=new ParkingSpot("129", SpotType.COMPACT);
        ParkingSpot parkingSpot8=new ParkingSpot("130", SpotType.LARGE);
        ParkingSpot parkingSpot9=new ParkingSpot("131", SpotType.MOTORCYCLE);

        ParkingFloor parkingFloor1=new ParkingFloor("F1",1, List.of(parkingSpot1,parkingSpot2,parkingSpot3));
        ParkingFloor parkingFloor2=new ParkingFloor("F2",2, List.of(parkingSpot4,parkingSpot5,parkingSpot6));
        ParkingFloor parkingFloor3=new ParkingFloor("F3",3, List.of(parkingSpot7,parkingSpot8,parkingSpot9));

        PricingStrategy pricingStrategy=new SimplePricingStrategy();
        ParkingStrategy parkingStrategy=new SimpleParkingStrategy();

        return new Parking("Marathalli",
                List.of(parkingFloor1,parkingFloor2,parkingFloor3),pricingStrategy,parkingStrategy);
    }


}
