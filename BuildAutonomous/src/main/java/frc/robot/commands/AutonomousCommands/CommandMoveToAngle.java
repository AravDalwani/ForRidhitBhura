/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.AutonomousCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSubsystem;

public class CommandMoveToAngle extends CommandBase {

  /**
   * Creates a new CommandMoveToAngle.
   */
  
  public DriveSubsystem m_driveSubsystem = new DriveSubsystem();
   
  double end;
  double initial;

  public CommandMoveToAngle(DriveSubsystem drive, double e) {
    // Use addRequirements() here to declare subsystem dependencies.
    end = e;
    m_driveSubsystem = drive;
    addRequirements(m_driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    RobotContainer.navx.reset();
    initial = RobotContainer.navx.getYaw();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveSubsystem.MoveToAngle(end);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (RobotContainer.navx.getYaw()) >= initial + end -3;
  }
}
