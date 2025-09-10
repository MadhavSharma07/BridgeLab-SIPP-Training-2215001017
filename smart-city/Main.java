import analytics.RevenueAnalytics;
import dashboard.Dashboard;
import model.Passenger;
import model.Trip;
import service.*;
import util.FareCalculator;
import util.FareUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
                new BusService(), new MetroService(), new TaxiService(), new AmbulanceService()
        );


        List<TransportService> sorted = services.stream()
                .filter(TransportService::isAvailable)
                .sorted(Comparator.comparing(TransportService::getFare))
                .collect(Collectors.toList());

        
        Dashboard dashboard = new Dashboard();
        dashboard.display(sorted);

        
        List<Passenger> passengers = Arrays.asList(
                new Passenger("Alice", "RouteA", 20),
                new Passenger("Bob", "RouteB", 30)
        );

        List<Trip> trips = Arrays.asList(
                new Trip("RouteA", 20, true),
                new Trip("RouteB", 30, false)
        );

        RevenueAnalytics.analyze(passengers, trips);

       
        FareCalculator calculator = FareUtils::calculateFare;
        System.out.println("Fare for trip: " + calculator.calculateFare(trips.get(0)));
    }
}