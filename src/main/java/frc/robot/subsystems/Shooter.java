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
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

/**
 *
 */
public class Shooter extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//private WPI_TalonFX shooter_Front;
//private WPI_TalonFX shooter_Back;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private TalonFX m_shooterFront;
private TalonFX m_shooterBack;
    /**
    *
    */
    public Shooter() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
//shooter_Front = new WPI_TalonFX(18);
m_shooterFront = new TalonFX(18); 
    /* Factory default hardware to prevent unexpected behavior */
//shooter_Front.configFactoryDefault();
m_shooterFront.getConfigurator().apply(new TalonFXConfiguration());
        /* Invert Motor? and set Break Mode */
m_shooterFront.setInverted(false);
m_shooterFront.setNeutralMode(NeutralModeValue.Brake);

        /* Set the peak and nominal outputs */
// shooter_Front.configNominalOutputForward(0, 30);
// shooter_Front.configNominalOutputReverse(0, 30);
// shooter_Front.configPeakOutputForward(1, 30);
// shooter_Front.configPeakOutputReverse(-1, 30);
        


//shooter_Back = new WPI_TalonFX(17);
m_shooterBack = new TalonFX(17);
    /* Factory default hardware to prevent unexpected behavior */
//shooter_Back.configFactoryDefault();
m_shooterBack.getConfigurator().apply(new TalonFXConfiguration());
        /* Invert Motor? and set Break Mode */
m_shooterBack.setInverted(false);
m_shooterBack.setNeutralMode(NeutralModeValue.Coast);

        /* Set the peak and nominal outputs */
// shooter_Back.configNominalOutputForward(0, 30);
// shooter_Back.configNominalOutputReverse(0, 30);
// shooter_Back.configPeakOutputForward(1, 30);
// shooter_Back.configPeakOutputReverse(-1, 30);
        



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
    public void ShooterFast(double speed){
        m_shooterFront.set(0.95);
        m_shooterBack.set(1);
    }
}

