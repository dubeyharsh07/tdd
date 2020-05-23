package co.interleap.courses.vo;


public class Ride {

    private Double distance;

    private Double time;

    public Ride(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }


}
