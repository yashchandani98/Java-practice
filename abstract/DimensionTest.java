abstract class dimension{
abstract  double rectangleArea(double w,double h);
}
abstract class Dimension2
{
abstract  double triangleArea(double b,double h);
}
class rectangle extends dimension{
double rectangleArea(double w,double h){
double rArea=w*h;
System.out.println("Rectangle area:"+rArea);
return 0;
}
}
class Triangle extends Dimension2{
double triangleArea(double b,double h){
double tArea=(b*h)/2;
System.out.println("Triangle area:"+tArea);
return 0;
}
}
class DimensionTest
{
public static void main(String args[])
{
rectangle r=new rectangle(); 
Triangle t=new Triangle();
//dimension r=new dimension();
r.rectangleArea(2,4);
t.triangleArea(3,8);
}
}