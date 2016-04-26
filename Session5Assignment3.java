
public class Session5Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaSquare as=new AreaSquare();
		AreaSquare as1=new AreaSquare(10);
		System.out.println("Area of Square is :-> "+as1.CalArea());
		AreaRectange ar=new AreaRectange();
		AreaRectange ar1=new AreaRectange(10,3);
		System.out.println("Area of Rectange is :-> "+ar1.CalArea());
	}

}

class AreaSquare
{
	private int x;
	
	AreaSquare()
	{
		System.out.println("Default Constructor of Square Class");
	}
	AreaSquare( int i)
	{
		x=i;
		System.out.println("Constructor With one Parameter of Square Class");
	}
	int CalArea()
	{
		return x*x;
	}
}
class AreaRectange
{
	private int x;
	private int y;
	
	AreaRectange()
	{
		System.out.println("Default Constructor of Rectangle Class");
	}
	AreaRectange( int i, int j)
	{
		x=i;
		y=j;
		System.out.println("Constructor With one Parameter of Rectangle Class");
	}
	int CalArea()
	{
		return x*y;
	}
}