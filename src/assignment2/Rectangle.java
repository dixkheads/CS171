package assignment2;

// This class represents a rectangle shape
public class Rectangle {

		private double L; // the length of the rectangle
		private double H; // the height of the rectangle
		private double x; // the x coordinate of the  bottom left corner of the rectangle
		private double y; // the y coordinate of the bottom left corner of the rectangle

		// TODO: [3 pts] Write a basic constructor that creates a rectangle with
		// side lengths 1 whose bottom left corner is at (0.0,0.0)
		// ... Add your code here ... //
		public Rectangle()
		{
			this.x = 0.0;
			this.y = 0.0;
			this.L = 1.0;
			this.H = 1.0;
		}

		// TODO: [3 pts] Now write a constructor that takes all four inputs,
		// named Ell, Eich, Ex, and Why for L, H, x, and y, respectively.
		// ... Add your code here ... //
		public Rectangle(double Ell, double Eich, double Ex, double Why)
		{
			this.x = Ex;
			this.y = Why;
			this.L = Ell;
			this.H = Eich;
		}

		// TODO: [2 pts] Write a method called getLength which returns the length.
		// ... Add your code here ... //
		public double getLength()
		{
			return this.L;
		}

		// TODO: [2 pts] Write a method called getHeight which returns the height.
		// ... Add your code here ... //
		public double getHeight()
		{
			return this.H;
		}

		// TODO: [2 pts] Write a method called setLength which takes as input a double
		// called Ell and uses it to set the length of the rectangle.
		// ... Add your code here ... //
		public void setLength(double Length)
		{
			this.L = Length;
		}

		// TODO: [2 pts] Write a method called setHeight which takes as input a double
		// called Eich and uses it to set the height of the rectangle.
		// ... Add your code here ... //
		public void setHeight(double Height)
		{
			this.H = Height;
		}

		// TODO: [2 pts] Write a method called perimeter which computes and returns
		// the perimeter of the rectangle.
		// ... Add your code here ... //
		public double perimeter()
		{
			return L + H + L + H;
		}

		// TODO: [2 pts] Write a method called area which computes and returns the
		// area of the rectangle.
		// ... Add your code here ... //
		public double area() 
		{
			return L * H;
		}

		// TODO: [2 pts] Override the method equals which is inherited from class Object
		// (similar to what we did in class Employee), and make it return true if the
		// two rectangles have equal areas, false otherwise
		// Important: Use the @Override annotation
		// ... Add your code here ... //
		@Override
		public boolean equals(Object another)
		{
			if(another instanceof Rectangle)
			{
				if(Math.abs(((Rectangle) another).area() - this.area()) <= 0.0001)
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
