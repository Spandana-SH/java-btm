class Juice
{
	String name;
	double price;
	String type;
	boolean takeaway;

	Juice(String name)
	{
		System.out.println("Running Juice");
		this.name=name;
	}
	Juice(String name,double price)
	{
		System.out.println("Running Juice");
		this.name=name;
		this.price=price;
	}
	Juice(String name,double price,String type)
	{
		System.out.println("Running Juice");
		this.name=name;
		this.price=price;
		this.type=type;
	}
	Juice(String name,double price,String type,boolean takeaway)
	{
		System.out.println("Running Juice");
		this.name=name;
		this.price=price;
		this.type=type;
		this.takeaway=takeaway;
	}

}