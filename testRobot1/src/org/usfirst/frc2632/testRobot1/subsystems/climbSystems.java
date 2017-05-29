// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2632.testRobot1.subsystems;

import org.usfirst.frc2632.testRobot1.RobotMap;
import org.usfirst.frc2632.testRobot1.commands.*;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class climbSystems extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Servo rightArm = RobotMap.climbSystemsrightArm;
    private final Servo leftArm = RobotMap.climbSystemsleftArm;
    private final SpeedController climbingMotor = RobotMap.climbSystemsclimbingMotor;
    private final Servo whiskerRelease = RobotMap.climbSystemswhiskerRelease;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        public void whiskerRelease() {
            whiskerRelease.set(.5)
        }
        public void armsEngage() {
            rightArm.set(1)
            leftArm.set(1)
        }
        public void armsDisengage() {
            rightArm.set(0)
            leftArm.set(0)
        }
        public void engage() {
            climbingMotor.set(0.5);
        } 
        public void climb(){
            climbingMotor.set(1);
        }
        public void stop(){
            climbingMotor.set(0.5);
        }
        public void reverse(){
            climbingMotor.set(-0.5)
        }
    }
}

