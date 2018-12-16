package tech.bts.exampreparation.model;


public class Movie {

    private String title;
    private double length;
    private boolean adult;

    public Movie(String title, double length, boolean adult) {
        this.title = title;
        this.length = length;
        this.adult = adult;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLenght(double length) {
        this.length = length;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.length + ": "+ this.adult;
    }
}
