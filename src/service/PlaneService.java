package service;

import model.Plane;

public class PlaneService {
    //    Task 1. (score 5)
//    Create a function:
//    Parameter one Plane
//    Result: print all information of the plane
    public void printAllInfo(Plane plane) {
        System.out.println("----------");
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year of production: " + plane.getYear());
        System.out.println("Hours in air: " + plane.getHours());
        System.out.println("Is Military: " + (plane.isMilitary() ? "Yes" : "No"));
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("Top Speed: " + plane.getTopSpeed());
        System.out.println("Number of seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());
    }

    //    Task 2. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print cost and topSpeed if the plane is military otherwise print model and country
    public void printInfoSummary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost of plane is: " + plane.getCost());
            System.out.println("Top speed of plane is: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel());
            System.out.println("Country: " + plane.getCountry());
        }
    }

    //    Task 3. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the plane which one is newer (if they have the same age return first one).
    public Plane newerPlane(Plane plane1, Plane plane2) {
        if (plane1.getYear() >= plane2.getYear()) {
            return plane1;
        } else {
            return plane2;
        }
    }

    //    Task 4. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).
    public String biggerWingspan(Plane plane1, Plane plane2) {
        if (plane1.getWingspan() <= plane2.getWingspan()) {
            return plane2.getModel();
        } else {
            return plane1.getModel();
        }
    }

    //    Task 5. (score 7)
//    Create function:
//    Parameter three Planes
//    Result: print country of the plane with smallest seats count (if they have the same - print first).
    public void smallestSeatNum(Plane plane1, Plane plane2, Plane plane3) {
        Plane smallestSeatsPlane = plane1;
        if (smallestSeatsPlane.getSeats() > plane2.getSeats()) {
            smallestSeatsPlane = plane2;
        }
        if (smallestSeatsPlane.getSeats() > plane3.getSeats()) {
            smallestSeatsPlane = plane3;
        }
        System.out.println(smallestSeatsPlane.getCountry());
    }

    //    Task 6. (score 7)
//    Create function:
//    Parameter array of Planes
//    Result: print all not military planes.
    public void printNonMilPlanes(Plane[] planes) {
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                printAllInfo(p);
            }
        }
    }

    //    Task 7. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: print all military planes which were in air more than 100 hours.
    public void printMilPlanes(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                printAllInfo(p);
            }
        }
    }

    //    Task 8. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal weight (if there are some of them return last one).
    public Plane minWeightPlane(Plane[] planes) {
        Plane min_Weight_Plane = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (min_Weight_Plane.getWeight() >= planes[i].getWeight()) {
                min_Weight_Plane = planes[i];
            }
        }
        return min_Weight_Plane;
    }

    //    Task 9. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).
    public Plane minCostMilPlane(Plane[] planes) {
        Plane min_Cost_Mil_Plane = null;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                if (min_Cost_Mil_Plane == null) {
                    min_Cost_Mil_Plane = planes[i];
                    continue;
                }
                if (min_Cost_Mil_Plane.getCost() > planes[i].getCost()) {
                    min_Cost_Mil_Plane = planes[i];
                }
            }
        }
        return min_Cost_Mil_Plane;
    }

    //    Task 10. (score 12)
//    Create function:
//    Parameter array of Planes
//    Result: print planes in ascending form order by year
    public void bubbleSortPlanes(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = 0; j < planes.length - 1; j++) {
                if (planes[j].getYear() >= planes[j + 1].getYear()) {
                    Plane stored_Plane = planes[j];
                    planes[j] = planes[j + 1];
                    planes[j + 1] = stored_Plane;
                }
            }
        }
        for (Plane p : planes) {
            printAllInfo(p);
        }
    }
}
