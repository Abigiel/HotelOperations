package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private boolean isWeekend;
    private int numOfNights;

    public Reservation(String roomType, double roomPrice, boolean isWeekend, int numOfNights){
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isWeekend = isWeekend;
        this.numOfNights = numOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        if(roomType.equalsIgnoreCase("king")){
            roomPrice = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            roomPrice = 124.00;
        }

        if(isWeekend){
            double weekendPrice = roomPrice + (0.1* roomPrice);
            return weekendPrice;
        } else{
            return roomPrice;
        }

    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
    public double getReservationTotal (){
        double totalPrice = this.numOfNights* getRoomPrice();
        return totalPrice;
    }
}
