

//immutable point class:
public class Point{

  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point point){
    return Math.sqrt(Math.pow((this.x - point.x),2) + Math.pow((this.y - point.y),2));
  }

  public static double distance(Point point1,Point point2){
    return Math.sqrt(Math.pow((point1.x - point2.x),2) + Math.pow((point1.y - point2.y),2));
  }

  public String toString(){
    return "("+ x + ", " + y + ")";
  }
}
