public class Main
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle(100, 200);
		System.out.println(rect.getArea());
		
		Rectangle square = new Square(100);
		System.out.println(square.getArea());
	}
}

class Square extends Rectangle
{
	public Square(int size)
	{
		super(size, size);
	}
}

class Rectangle
{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) 
	{
		this.width = width;
		this.height = height;
	}
	
	public int getArea()
	{
		return width * height;
	}
}
