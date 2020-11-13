package main;

import service.PlaneService;
import model.Plane;

public class AirportTest {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boeing", "USA", 2008, 555, false, 120000, 33, 1000, 300, 600000);
        PlaneService service = new PlaneService();
        service.printAllInfo(plane1);
        Plane plane2 = new Plane("AM300", "Russia", 2006, 444, false, 130000, 35, 54, 120, 640000);
        service.printInfoSummary(plane1);
        service.newerPlane(plane1, plane2);
    }
}
