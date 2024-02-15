// RobotBuilder Version: 6.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX; import com.ctre.phoenix.motorcontrol.NeutralMode;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import java.util.Set;
import java.util.ResourceBundle.Control;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.CoastOut;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.NeutralOut;
import com.ctre.phoenix6.controls.VoltageOut;
/**
 *
 */
public class Intake extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//private WPI_TalonFX intake_Motor;
private TalonFX m_intakemotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Intake() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
// intake_Motor = new WPI_TalonFX(16);
m_intakemotor = new TalonFX(16);
//     /* Factory default hardware to prevent unexpected behavior */
// intake_Motor.configFactoryDefault();
m_intakemotor.getConfigurator().apply(new TalonFXConfiguration());
//         /* Invert Motor? and set Break Mode */
// intake_Motor.setInverted(false);
m_intakemotor.setInverted(false);
// intake_Motor.setNeutralMode(NeutralMode.Coast);
m_intakemotor.setNeutralMode(NeutralModeValue.Brake);
//         /* Set the peak and nominal outputs */
// intake_Motor.configNominalOutputForward(0, 30);
// intake_Motor.configNominalOutputReverse(0, 30);
// intake_Motor.configPeakOutputForward(1, 30);
// intake_Motor.configPeakOutputReverse(-1, 30);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void Intakerun(double speed){
        m_intakemotor.set(0.7);
    }
}

