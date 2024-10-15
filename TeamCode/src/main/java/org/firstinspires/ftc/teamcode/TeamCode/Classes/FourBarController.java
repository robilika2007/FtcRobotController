package org.firstinspires.ftc.teamcode.TeamCode.Classes;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@Config
public class FourBarController {
    Servo left, right;

    public static double leftIntakePosition = 0.5;
    public static double rightIntakePosition = 0.5;

    public static double leftOuttakePosition = 0.5;
    public static double rightOuttakePosition = 0.5;

    public FourBarController(HardwareMap hardwareMap) {
        left = hardwareMap.get(Servo.class, "left");
        right = hardwareMap.get(Servo.class, "right");
    }

    public void goToIntake() {
        left.setPosition(leftIntakePosition);
        right.setPosition(rightIntakePosition);
    }

    public void goToOuttake() {
        left.setPosition(leftOuttakePosition);
        right.setPosition(rightOuttakePosition);
    }

}
