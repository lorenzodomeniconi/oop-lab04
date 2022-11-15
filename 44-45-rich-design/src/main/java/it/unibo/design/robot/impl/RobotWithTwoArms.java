package it.unibo.design.robot.impl;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{
    private final BasicArm arm1;
    private final BasicArm arm2;
    private int counterGrabbing;
    public RobotWithTwoArms(String robotName) {
        super(robotName);
        counterGrabbing=0;
        arm1 = new BasicArm();
        arm2 = new BasicArm();
    }

    public boolean pickUp(){
        if(!arm1.isGrabbing()){
            arm1.pickUp();
            counterGrabbing++;
            super.consumeBattery(arm1.getConsuptionForPickUp()*counterGrabbing+1);
            super.MOVEMENT_DELTA_CONSUMPTION++;
            return true;
        }
        else if(!arm2.isGrabbing()){
            arm2.pickUp();
            counterGrabbing++;
            super.consumeBattery(arm1.getConsuptionForPickUp()*counterGrabbing+1);
            super.MOVEMENT_DELTA_CONSUMPTION++;
            return true;
        }
        else{
            return false;
        }
    }

	public boolean dropDown() {
        if(arm1.isGrabbing()){
            arm1.dropDown();
            counterGrabbing--;
            super.consumeBattery(arm1.getConsuptionForDropDown());
            super.MOVEMENT_DELTA_CONSUMPTION--;
            return true;
        }
        else if(arm2.isGrabbing()){
            arm2.dropDown();
            counterGrabbing--;
            super.consumeBattery(arm1.getConsuptionForDropDown());
            super.MOVEMENT_DELTA_CONSUMPTION--;
            return true;
        }
        else{
            return false;
        }
    }

	public int getCarriedItemsCount() {
		return this.counterGrabbing;
	}
}
