package randomJunk;

public class PrimeNum 
{
	public void main(String[] args)
	{
		
	}
}



abstract class A {
  abstract int increment(int x);
}

class B extends A {
  int increment(int x) { return ++x; }
}

abstract class BC extends A {
	  int increment(int x) { return ++x; }
	}

class BAC extends A {
	  int decrement(int y) { return --y; }
	}

abstract class BADAD extends A {
	  // empty body ...
	}
