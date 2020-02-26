/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.SolenoidCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SolenoidSubsystem;

public class DownCommand extends CommandBase {
  /**
   * Creates a new DownCommand.
   */

  private SolenoidSubsystem m_SolenoidSubsystem = new SolenoidSubsystem();

  public DownCommand(SolenoidSubsystem solenoid) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_SolenoidSubsystem = solenoid;
    addRequirements(m_SolenoidSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_SolenoidSubsystem.setMode(2);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
