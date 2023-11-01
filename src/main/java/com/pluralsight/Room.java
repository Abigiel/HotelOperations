package com.pluralsight;

public class Room {
    private boolean clean;
    private boolean available;
    private int numOfBeds;
    private double price;

    public Room(boolean clean, boolean available, int numOfBeds, double price){
        this.clean= clean;
        this.available = available;
        this.numOfBeds = numOfBeds;
        this.price = price;

    }

    public boolean isClean() {
        return this.clean;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public int getNumOfBeds() {
        return this.numOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public void cleanRoom(){
        this.clean= true;

    }
    public void checkIn(){
        this.available= false;
        this.clean = false;

    }

    public void checkOut(){
        cleanRoom();
        this.available = true;
    }

}
