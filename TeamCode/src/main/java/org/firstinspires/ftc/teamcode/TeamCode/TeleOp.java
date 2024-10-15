package org.firstinspires.ftc.teamcode.TeamCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.TeamCode.Classes.ChassisController;
import org.firstinspires.ftc.teamcode.TeamCode.Classes.ClawController;
import org.firstinspires.ftc.teamcode.TeamCode.Classes.FourBarController;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends LinearOpMode {
    //test2
    ChassisController chassis;
    FourBarController fourBar;
    ClawController claw;

    @Override
    public void runOpMode() throws InterruptedException {

        chassis = new ChassisController(hardwareMap);
        fourBar = new FourBarController(hardwareMap);
        claw = new ClawController(hardwareMap);

        waitForStart();

        while(opModeIsActive()) {
            chassis.move(gamepad1);

            if(gamepad1.a) {
                fourBar.goToIntake();
            } else if(gamepad1.y) {
                fourBar.goToOuttake();
            }

            if(gamepad1.right_bumper) {
                claw.close();
            } else if(gamepad1.left_bumper) {
                claw.open();
            }

        }
    }
}
