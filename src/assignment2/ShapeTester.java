/*THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Harry He*/
package assignment2;

public class ShapeTester {

  // !!!Important!!!
  // All methods in this class should be declared "static"

  // TODO: [2 pts] Write the method isLarger which takes as input two shapes
  // (a Circle first, then a Rectangle) and returns true if the area of
  // the circle is bigger than (or equal to) the area of the rectangle,
  // false otherwise.
  // ... Add your code here ... //
	public static boolean isLarger(Circle circle, Rectangle rectangle)
	{
		if(circle.getArea() >= rectangle.area())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

  // TODO: [2 pts] Write the method longerPerim which takes as input
  // a Circle object followed by a Rectangle object and returns
  // the length of the perimeter of the longer of the two objects.
  // ... Add your code here ... //
	public static double longerPerim(Circle circle, Rectangle rectangle)
	{
		if(circle.getCircumference() > rectangle.perimeter())
		{
			return circle.getCircumference();
		}
		else
		{
			return rectangle.perimeter();
		}
	}

  // TODO: [2 pts] Write another version of the method longerPerim which has the
  // same name and functionality but it takes as input a Rectangle object
  // followed by a Circle object. The method also returns the length of
  // the perimeter of the longer of the two objects.
  // ... Add your code here ... //
	public static double longerPerim(Rectangle rectangle, Circle circle)
	{
		if(circle.getCircumference() > rectangle.perimeter())
		{
			return circle.getCircumference();
		}
		else
		{
			return rectangle.perimeter();
		}
	}

  // TODO: [2 pts] Write the method largerArea which takes as input
  // a Circle object followed by a Rectangle object and returns
  // the area of the larger of the two objects.
  // ... Add your code here ... //
	public static double largerArea(Rectangle rectangle, Circle circle)
	{
		if(circle.getArea() > rectangle.area())
		{
			return circle.getArea();
		}
		else
		{
			return rectangle.area();
		}
	}

  // TODO: [2 pts] Writer another version of the method largerArea which has the
  // same name and functionality but it takes as input a Rectangle object
  // followed by a Circle object.
  // ... Add your code here ... //
	public static double largerArea(Circle circle, Rectangle rectangle)
	{
		if(circle.getArea() > rectangle.area())
		{
			return circle.getArea();
		}
		else
		{
			return rectangle.area();
		}
	}

  // TODO: [10 pts] Write the method containsCenter which takes as input two circles,
  // and returns true if the first circle contains the center of the second circle,
  // false otherwise.
  // ... Add your code here ... //
	public static boolean containsCenter(Circle circle1, Circle circle2)
	{
		if(circle1.containsPoint(circle2.x, circle2.y))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
