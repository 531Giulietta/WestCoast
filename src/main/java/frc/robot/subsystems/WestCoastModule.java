// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class WestCoastModule extends SubsystemBase {
  /** Creates a new WestCoastModule. */
  private final WPI_VictorSPX forwardMotor;
  private final WPI_VictorSPX backMotor;

  public WestCoastModule(int forwardMotor_ID, int backMotor_ID, boolean forwardMotorReverse, boolean backMotorReserve) {
    forwardMotor = new WPI_VictorSPX(forwardMotor_ID);
    backMotor = new WPI_VictorSPX(backMotor_ID);

    backMotor.follow(forwardMotor);

    forwardMotor.setNeutralMode(NeutralMode.Brake);
    backMotor.setNeutralMode(NeutralMode.Coast);

    forwardMotor.setInverted(forwardMotorReverse);
    backMotor.setInverted(backMotorReverse);
  }
  public WPI_VictorSPX getForwardMotor(){
    return forwardMotor;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
