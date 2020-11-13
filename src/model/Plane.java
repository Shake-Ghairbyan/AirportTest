package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, int hours, boolean isMilitary, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMilitary = isMilitary;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() != 0) {
            this.model = model;
        } else {
            System.out.println("Wrong input. Should be any not empty string.");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() != 0) {
            this.country = country;
        } else {
            System.out.println("Wrong input. Should be any not empty string.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (1903 <= year && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Wrong input. Must be in range of 1903-2020");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (0 <= hours && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Wrong input. Hours in air must be in range of 0-10000");
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (1000 <= weight && weight <= 160000) {
            this.weight = weight;
        } else {
            System.out.println("Wrong input. Weight must be in range of 1000-160000");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (10 <= wingspan && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Wrong input. Wingspan must be in range of 10-45");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if ( 0 <= topSpeed && topSpeed<= 1000) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Wrong input. Speed must be in range of 0-1000km/h");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (0 <= seats) {
            this.seats = seats;
        } else {
            System.out.println("Wrong input of seats number: must be non-negative value");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (0 <= seats) {
            this.cost = cost;
        } else {
            System.out.println("Wrong input of costs of plane: must be non-negative value");
        }
    }

}
