package Kaja.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"Kaja.structure.CommandList", "Kaja.structure.CommentLine", "Kaja.structure.Drop", "Kaja.structure.East", "Kaja.structure.EmptyLine", "Kaja.structure.Heading", "Kaja.structure.IfStatement", "Kaja.structure.IsFull", "Kaja.structure.IsMark", "Kaja.structure.IsWall", "Kaja.structure.LeftTurn", "Kaja.structure.Library", "Kaja.structure.North", "Kaja.structure.Not", "Kaja.structure.Pick", "Kaja.structure.Repeat", "Kaja.structure.Require", "Kaja.structure.RoutineCall", "Kaja.structure.RoutineDefinition", "Kaja.structure.Script", "Kaja.structure.South", "Kaja.structure.Step", "Kaja.structure.TraceMessage", "Kaja.structure.West", "Kaja.structure.While"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 19:
        return new Script_BehaviorDescriptor();
      case 21:
        return new Step_BehaviorDescriptor();
      case 10:
        return new LeftTurn_BehaviorDescriptor();
      case 6:
        return new IfStatement_BehaviorDescriptor();
      case 9:
        return new IsWall_BehaviorDescriptor();
      case 13:
        return new Not_BehaviorDescriptor();
      case 15:
        return new Repeat_BehaviorDescriptor();
      case 24:
        return new While_BehaviorDescriptor();
      case 12:
        return new North_BehaviorDescriptor();
      case 3:
        return new East_BehaviorDescriptor();
      case 20:
        return new South_BehaviorDescriptor();
      case 23:
        return new West_BehaviorDescriptor();
      case 5:
        return new Heading_BehaviorDescriptor();
      case 18:
        return new RoutineDefinition_BehaviorDescriptor();
      case 17:
        return new RoutineCall_BehaviorDescriptor();
      case 4:
        return new EmptyLine_BehaviorDescriptor();
      case 0:
        return new CommandList_BehaviorDescriptor();
      case 2:
        return new Drop_BehaviorDescriptor();
      case 14:
        return new Pick_BehaviorDescriptor();
      case 8:
        return new IsMark_BehaviorDescriptor();
      case 1:
        return new CommentLine_BehaviorDescriptor();
      case 7:
        return new IsFull_BehaviorDescriptor();
      case 11:
        return new Library_BehaviorDescriptor();
      case 16:
        return new Require_BehaviorDescriptor();
      case 22:
        return new TraceMessage_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
