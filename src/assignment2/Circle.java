/*THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Harry He*/
package assignment2;

// This class represents a circle shape
public class Circle {

    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center

    // The default constructor with no argument
    public Circle(){
      // Initializing the values of the instance variables
      radius = 1.0;
      x = 0.0;
      y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
      radius = r;
      x = 0.0;
      y = 0.0;
    }

    // TODO: [2 pts] Complete this overloaded constructor FINISHED
    // Parameter r should be the radius length
    // Parameter ex should be the x coordinate
    // Parameter why should be the y coordinate
    public Circle(double r, double ex, double why) {
    	radius = r;
    	x = ex;
    	y = why;
    	// ... Add your code here ... //
    }

    // A public getter method for retrieving the radius
    public double getRadius() {
     return radius;
    }

    // A public getter method for retrieving the center coordinates
    public double[] getCenter() {
     double[] c = {this.x, this.y};
     return c;
    }

    // A public getter method for computing and returning
    // the area of the circle
    public double getArea() {
      return radius * radius * Math.PI;
    }

    // TODO: [2 pts] A public method you need to write to FINISHED
    // compute and return the circumference of the circle
    public double getCircumference() {
    	return 2 * radius * Math.PI;
    	// ... Add your code here ... //
    }

    // TODO: [3 pts] A public method that compares the sizes of two circles: the circle FINISHED
    // represented by the current object, and the circle passed as a parameter.
    // Example: circleA.isBiggerThan(circleB) should return true if circleA
    // has a larger area than circleB, false otherwise.
    // NOTE: You may need to modify the parameter list!
    public boolean isBiggerThan(Circle compareCircle) {
    	if(compareCircle.radius < this.radius)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
      // ... Add your code here ... //
    }

    // TODO: [6 pts] A public method that takes as input an x coordinate (as a double) FINISHED
    // and a y coordinate (a double), and returns true if the (x, y) coordinate
    // is inside the current circle, false otherwise.
    // NOTE: You may need to modify the parameter list!
    public boolean containsPoint(double x, double y) {
    	if(((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) <= this.radius * this.radius)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	// ... Add your code here ... //
    }

    // TODO: [2 pts] Write a method named setRadius that sets this object's radius FINISHED
    // based on the passed parameter (of type double).
    // The method should not return anything.
    // ... Add your method setRadius here here ... //
    public void setRadius(double radius)
    {
    	this.radius = radius;
    }

    // TODO: [2 pts] Write a method named setCenter that sets this object's center. FINISHED
    // The method takes two doubles as parameters: ex and why.
    // It should set the x coordinate of the circle to ex,
    // and the y coordinate of the circle to why.
    // The method should not return anything.
    // ... Add your method here ... //
    public void setCenter(double ex, double why)
    {
    	this.x = ex;
    	this.y = why;
    }

    // TODO: [1 pt] Complete the overriden method toString which should FINISHED
    // return the string representation of this Circle object, as follows:
    // "This circle is centered at point <display_coordinate_of_center_here>
    // with radius <display_radius>"
    @Override
    public String toString() {
        return "This circle is centered at point: x = " + this.x + ", y = " + this.y + ", and a radius of " + this.radius + ". "; // TODO
    }

		// TODO: [2 pts] Override the method equals which is inherited from class Object FINISHED
		// (similar to what we did in class Employee), and make it return true if the
		// two circles have equal areas, false otherwise
		// Important: Use the @Override annotation
		// ... Add your code here ... //
    @Override
    public boolean equals(Object compareCircle)
    {
    	if(compareCircle instanceof Circle)
    	{
    		if(Math.abs(this.radius - ((Circle) compareCircle).radius) < 0.0001)
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	else
    	{
    		return false;
    	}
    }
}
