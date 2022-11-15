package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.Robot;

public interface RobotWithArms extends Robot{
    /*
     * picks an object
     * return true if the action
     * is successfull
     */
    boolean pickUp();

    /*
     * drops an object,
     * return true if the action
     * is successfull
     */
    boolean dropDown();

    /*
     * returns the number of objects
     * this robot is currently transporting
     */
    int getCarriedItemsCount();
}
