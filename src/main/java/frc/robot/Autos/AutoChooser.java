// package frc.robot.Auton;

// import java.util.EnumMap;
// import java.util.Optional;

// import com.choreo.lib.ChoreoTrajectory;

// import edu.wpi.first.math.geometry.Pose2d;
// import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
// import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardComponent;
// import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.Commands;



// public class AutoChooser {
//     public enum AutonOption {
//         DO_NOTHING("0 - do nothing", new ChoreoTrajectory()),
//         ONE_METER("0 - one meter", Trajectories.oneMeter),
//         TRAP("0 - go to trap", Trajectories.trap),

//         public final String m_description;
//         public final ChoreoTrajectory m_traj;

//         AutonOption(String description, ChoreoTrajectory traj) {
//             m_description = description;
//             m_traj = traj;
//         }
//         @Override
//         public String toString() {
//             return name() + ": " + m_description;
//         }
//     }
//     private AutoChooser() {
//         // utility class, do not create instances!
//     }

//     private static EnumMap<AutonOption, Command> autonChooserMap = new EnumMap<>(AutonOption.class);
//     private static EnumMap<AutonOption, Optional<Pose2d>> autonInitPoseMap = new EnumMap<>(AutonOption.class);
//     private static final SendableChooser<AutonOption> autonNTChooser = new SendableChooser<AutonOption>();

//     static {
//         SmartDashboard.putData("AutonChooser", autonNTChooser);
//     }

//     public static void assignAutonCommand(AutonOption auton, Command command, Pose2d holonomicStartPose) {
//         autonChooserMap.put(auton, command);
//         autonInitPoseMap.put(auton, Optional.ofNullable(holonomicStartPose));

//         autonNTChooser.addOption(auton.m_description, auton);
//     }

//     public static void assignAutonCommand(AutonOption auton, Command command) {
//         assignAutonCommand(auton, command, null);
//     }

//     public static void setDefaultAuton(AutonOption auton) {
//         autonNTChooser.setDefaultOption(auton.m_description, auton);
//     }

//     public static Command getAuton(AutonOption auton) {
//         return autonChooserMap.computeIfAbsent(auton, a -> Commands.print("warning: empty auton!")
//             .withName("InvalidAuton"));
//     }

//     public static Optional<Pose2d> getAutonInitPose(AutonOption auton) {
//         Optional<Pose2d> result = autonInitPoseMap.computeIfAbsent(auton, a -> Optional.empty());
//         return result;
//     }

//     public static ChoreoTrajectory getTrajectory(AutonOption auton) {
//         return auton.m_traj;
//     }

//     public static Command getChosenAutonCmd() {
//         return getAuton(autonNTChooser.getSelected());
//     }

//     public static Optional<Pose2d> getChosenAutonInitPose() {
//         var selected = AutoChooser.autonNTChooser.getSelected();

//         if (selected == null) {
//             return Optional.empty();
//         }

//         return getAutonInitPose(selected);
//     }

//     public static ChoreoTrajectory getChosenTrajectory() {
//         var selected = AutoChooser.autonNTChooser.getSelected();
//         return selected.m_traj;
//     }
// }