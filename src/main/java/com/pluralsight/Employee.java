package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double time;
    private double regularHours;
    private double overTimeHours;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return (payRate * getRegularHours()) + (payRate * getOvertimeHours() * 1.5);
    }

    public double getRegularHours(){
        if(hoursWorked <= 40 ){
            regularHours = hoursWorked;
        } else {
            regularHours = 40;
        }
        return regularHours;
    }
    public double getOvertimeHours(){
        if(hoursWorked >40){
            overTimeHours = hoursWorked -40;
        } else{
            overTimeHours = 0;
        }
        return overTimeHours;
    }

    // REVISE BELOW

    public void punchIn(){
        LocalTime in = LocalTime.now();
        double start = in.getHour() + ((double) in.getMinute() /60);
    }
    public void punchOut(){
        LocalTime out = LocalTime.now();
        double end = out.getHour() + ((double) out.getMinute() /60);
    }
    public void punchIn(double time){
        double start = this.time;
    }

    public void punchOut(double time){
        double end = this.time;

    }
    public void punchTimeCard(){

    }

}
