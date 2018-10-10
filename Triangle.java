public class Triangle{
  private point1;
  private point2
  private point3;

  public Triangle(Point Point1,Point Point2,Point Point3){
    point1 = new point (Point1);
    point2 = new point (Point2);
    point3 = new point (Point3);
}

  public Triangle(double x1,double y1, double x2, double y2, double x3, double y3){
    point1 = new point(x1,y1);
    point2 = new point(x2,y2);
    point3 = new point(x3,y3);
}
  public double getPerimeter(){
    
