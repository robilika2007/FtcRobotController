package org.firstinspires.ftc.teamcode.TeamCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends LinearOpMode {

    //declaram diferite chestii aici

    Servo servo;

    @Override
    public void runOpMode() throws InterruptedException {
        servo = hardwareMap.get(Servo.class, "s0");



        waitForStart();

        while(opModeIsActive()) {
            //citesc controllerul
            //misc robotul

            if(gamepad1.a)
            {
                servo.setPosition(0.5);
            }
            if(gamepad1.b)
            {
                servo.setPosition(0.7);
            }


        }
    }
}
