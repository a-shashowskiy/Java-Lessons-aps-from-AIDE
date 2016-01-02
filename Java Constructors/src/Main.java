public class Main
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle(100,200);
		System.out.println(rect.width);
		System.out.println(rect.height);
		Rectangle rect2= new Rectangle(10,20);
		System.out.println(rect2.width);
		System.out.println(rect2.height);
		Rectangle rect3=new Rectangle();
		System.out.println(rect3.width);
		System.out.println(rect3.height);
	}
}

class Rectangle
{
	int width;
	int height;
	
	// A constructor
	Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
		
	}
	Rectangle()
	{
		this.width=100;
		this.height=100;
	}
	
}
