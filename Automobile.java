
public class Automobile {
	
	private int doors;
	private int cylinders;
	private int trans;
	private String name;
	
	public Automobile (int doors, int cylinders, int trans, String name)
	{
		this.doors = doors;
		this.cylinders = cylinders;
		this.trans = trans;
		this.name = name;
	}
	public String toString()
	{
		return String.format("\nThis car has\nDoor: %d\nCylinders: %d\nTransmition: %d\nName: %s", doors, cylinders, trans, name);
	}

}
