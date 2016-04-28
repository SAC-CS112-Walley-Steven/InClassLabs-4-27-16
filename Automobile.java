
public class Automobile {
	
	private int doors;
	private int cylinders;
	private int trans;
	private String name;
	private String color;
	
	public Automobile (String color, int doors, int cylinders, int trans)
	{
		this.doors = doors;
		this.cylinders = cylinders;
		this.trans = trans;
		this.name = name;
	}
	public void setName(String name)
	{	
		this.name = name;
	}
	public String toString()
	{
		return String.format("\nName: %s\nDoors: %d\nCylinders: %d\nTransmition: %d",
				name, doors, cylinders, trans);
	}

}
