/*THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Harry He*/
package assignment2;

public class Cylinder extends Circle
{
	protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center
    protected double height;
    
	public Cylinder()
	{
		x = 0.0;
		y = 0.0;
		radius = 1;
		height = 1;
	}
	
	public Cylinder(double x, double y, double radius, double height)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	@Override
	public double getArea()
	{
		return super.getArea() + super.getCircumference() * this.height;
	}
	
	public double getVolume()
	{
		return super.getArea() * this.height;
	}
}