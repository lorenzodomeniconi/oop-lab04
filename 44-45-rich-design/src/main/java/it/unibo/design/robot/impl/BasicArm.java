package it.unibo.design.robot.impl;

public class BasicArm {
    private boolean busy;
    public static final double GRAB_CONSUPTION = 1;
    public static final double DROP_CONSUPTION = 0.7;
    public BasicArm() {
        busy = false;
    }
    public boolean isGrabbing(){
        if(busy==true){
            return true;
        }
        else{
            return false;
        }
    }
    public void pickUp(){
        if(this.busy == true){
            System.out.println("already grabbing something");
        }
        else{
            this.busy = true;
        }
    }
    public void dropDown(){
        if(this.busy == false){
            System.out.println("already grabbing nothing");
        }
        else{
            this.busy = false;
        }
        
    }
    public double getConsuptionForPickUp(){
        return GRAB_CONSUPTION;
    }
    public double getConsuptionForDropDown(){
        return DROP_CONSUPTION;
    }
}
