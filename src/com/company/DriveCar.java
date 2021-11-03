package com.company;

public class DriveCar {
    private Car Tesla;
    private Car Kia;
    
    public DriveCar(){
        Tesla = new Tesla();
        Kia = new Kia();
    }

    public void DriveTesla(){
        Tesla.drive();
    }

    public void DriveKia(){
        Kia.drive();
    }
}
