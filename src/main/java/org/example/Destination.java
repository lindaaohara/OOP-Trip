package org.example;

public class Destination {
    private String name;
    private Double distance;
    private Double costPerMile;
    private Boolean requireCovidTest;

    public Destination(String name){
        this.name = name;
    }

    public void allowToVisit(Traveler traveler) throws Exception{


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getCostPerMile() {
        return costPerMile;
    }

    public void setCostPerMile(Double costPerMile) {
        this.costPerMile = costPerMile;
    }

    public Boolean getRequireCovidTest() {
        return requireCovidTest;
    }

    public void setRequireCovidTest(Boolean requireCovidTest) {
        this.requireCovidTest = requireCovidTest;
    }
}
