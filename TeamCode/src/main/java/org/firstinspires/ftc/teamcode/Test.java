package org.firstinspires.ftc.teamcode;
//program scris pentru Xbox 360 de la Microsoft
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="PatruMotoareCombinatieBuna", group="Aquila")
public class Test extends LinearOpMode
{
    private DcMotor motorFrontLeft;
    private DcMotor motorFrontRight;
    private DcMotor motorBackLeft;
    private DcMotor motorBackRight;

    @Override
    public void runOpMode () throws InterruptedException
    {

        motorFrontLeft = hardwareMap.dcMotor.get("motorFrontLeft");
        motorFrontRight = hardwareMap.dcMotor.get("motorFrontRight");
        motorBackLeft = hardwareMap.dcMotor.get("motorBackLeft");
        motorBackRight = hardwareMap.dcMotor.get("motorBackRight");

        motorFrontLeft.setDirection(DcMotor.Direction.REVERSE);
        motorBackLeft.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive())
        {
            motorFrontLeft.setPower(-gamepad1.left_stick_y);
            motorFrontRight.setPower(-gamepad1.left_stick_x);
            motorBackLeft.setPower(-gamepad1.left_stick_y);
            motorBackRight.setPower(-gamepad1.left_stick_x);
            idle();
        }
    }
}
