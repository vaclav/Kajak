package Kajak.sandbox.sandbox;

/*Generated by MPS */

import JavaKajak.runtime.KajakFrame;

public class Sample extends KajakFrame {
  public Sample() {
  }

  protected void perform() {
    if (canMove()) {
      moveKaja();
      pause();
    } else {
      reportError("Oops, There's a wall in front of me. I can't make a step forward.");
      return;
    }
    for (int indexVariable_kf1bs5_b0 = 0; indexVariable_kf1bs5_b0 < 5; indexVariable_kf1bs5_b0++) {
      if (canMove()) {
        moveKaja();
        pause();
      } else {
        reportError("Oops, There's a wall in front of me. I can't make a step forward.");
        return;
      }
    }
    fill_routine();
    if (canMove()) {
      moveKaja();
      pause();
    } else {
      reportError("Oops, There's a wall in front of me. I can't make a step forward.");
      return;
    }
  }

  public void fill_routine() {
    while (!(isFull())) {
      if (!(isFull())) {
        addMark();
        pause();
      } else {
        reportError("Cannot drop. The cell is already full.");
        return;
      }
    }
  }

  public static void main(String[] args) {
    Sample script = new Sample();
    script.initializeComponents();
    script.run();
  }
}
