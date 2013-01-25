package JavaKajak.runtime;

/*Generated by MPS */


public class Cell {
  private int marks = 0;
  private boolean wall = false;
  private boolean kaja = false;

  public Cell(boolean wall) {
    this.wall = wall;
  }

  public void setKaja() {
    if (wall) {
      throw new RuntimeException("Kaja cannot be placed on a wall.");
    }
    kaja = true;
  }

  public void unsetKaja() {
    kaja = false;
  }

  public boolean isKaja() {
    return kaja;
  }

  public void setWall() {
    wall = true;
  }

  public void unsetWall() {
    wall = false;
  }

  public boolean isWall() {
    return wall;
  }

  public void addMark() {
    marks++;
  }

  public void removeMark() {
    marks--;
  }

  public int getMarks() {
    return marks;
  }
}
