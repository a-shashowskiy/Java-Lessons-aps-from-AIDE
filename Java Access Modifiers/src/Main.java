public class Main
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle(100, 200);
		
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
	}
}

class Rectangle
{
	private int width;
	private int height;
	
	Rectangle(int width, int height) 
	{
		this.width = width;
		this.height = height;
	}
	public int getWidth()
	{
		return this.width;
	}
	public int getHeight()
	{
		return this.height;
	}
}
