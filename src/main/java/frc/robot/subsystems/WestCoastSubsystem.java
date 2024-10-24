// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class WestCoastSubsystem extends SubsystemBase {
  /** Creates a new WestCoastSubsystem. */
  private final WestCoastModule rightWestCoastModule;
  private final WestCoastModule leftWestCoastModule;

  private final DifferentialDrive drive;
  

  public WestCoastSubsystem() {
    rightWestCoastModule = new WestCoastModule(WestCoastConstants.forwardModule_ID, WestCoastConstants.backModule_ID, WestCoastConstants.forwardModuleReverse, WestCoastConstants.backModuleReverse);
    leftWestCoastModule = new WestCoastmodule(WestCoastConstants.forwardModule_ID, WestCoastConstants.backModule_ID, WestCoastConstants.forwardModuleReverse, WestCoastConstants.backModuleReverse);
    drive = new DifferentialDrive(leftWestCoastModule.getforwardMotor(), rightWestCoastModule.getforwardMotor());
  }

  public void manualDrive(double move, double turn){
    drive.arcadeDrive(move, turn);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
