package KajaSceneConstruction.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"KajaSceneConstruction.structure.BuildWall", "KajaSceneConstruction.structure.DestroyWall", "KajaSceneConstruction.structure.DropMark", "KajaSceneConstruction.structure.PickMark"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 0:
        return new BuildWall_BehaviorDescriptor();
      case 1:
        return new DestroyWall_BehaviorDescriptor();
      case 2:
        return new DropMark_BehaviorDescriptor();
      case 3:
        return new PickMark_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
