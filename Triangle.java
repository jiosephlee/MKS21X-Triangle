public class Triangle{
  private Point point1;
  private Point point2;
  private Point point3;

  public Triangle(Point Point1,Point Point2,Point Point3){
    point1 = new Point (Point1);
    point2 = new Point (Point2);
    point3 = new Point (Point3);
}

  public Triangle(double x1,double y1, double x2, double y2, double x3, double y3){
    point1 = new Point(x1,y1);
    point2 = new Point(x2,y2);
    point3 = new Point(x3,y3);
}
  public double getPerimeter(){
    return point1.distanceTo(point2) + point2.distanceTo(point3) + point3.distanceTo(point1);
  }

  public Point getVertex(int index){
    if (index == 0){
      return this.point1;
    }
    else if (index == 1){
      return this.point2;
    }
    return this.point3;
  }

  public void setVertex(int index, Point point){
    if(index == 0){
      point1 = new Point(point);
    }
    if(index == 1){
      point2 = new Point(point);
    }
    if(index == 2){
      point3 = new Point(point);
    }
  }
  public String toString(){
    return "Triangle: A" + point1 + ", B" + point2 + ", C" + point3;
  }
}
