package dataObject;

public class PointDTA {

  // DECLARATION
  private int xAxis;
  private int yAxis;

  // CONSTRUCTOR
  PointDTA(int xAxisArg, int yAxisArg) {
    this.xAxis = xAxisArg;
    this.yAxis = yAxisArg;
  }

  // GET METHODS
  public int getXAxis() {
    return this.xAxis;
  }

  public int getYAxis() {
    return this.yAxis;
  }

  // SET METHODS
  public void setXAxis(int xAxisArg) {
    this.xAxis = xAxisArg;
  }

  public void setYAxis(int yAxisArg) {
    this.yAxis = yAxisArg;
  }
}