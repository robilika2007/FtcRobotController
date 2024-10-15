package org.firstinspires.ftc.teamcode.TeamCode.Tests;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@Config
@TeleOp
public class FindServoPosition extends LinearOpMode {
    Servo servo;
    public static double position = 0.5;
    public static String numeServo = "s0";
    @Override
    public void runOpMode() throws InterruptedException {
        servo = hardwareMap.get(Servo.class, numeServo);
        servo.setPosition(position);
        waitForStart();
        while(opModeIsActive()) {
            if(gamepad1.dpad_up) {
                position += 0.001;
            }else if(gamepad1.dpad_down) {
                position -= 0.001;
            }
            servo.setPosition(position);
        }
    }
}
