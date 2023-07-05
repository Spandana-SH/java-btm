class JuiceRunner
{
	public static void main(String[] args)
	{
		System.out.println("running Juice main");

		Juice ref=new Juice("lychee");
		System.out.println("name is:"+ref.name);
		System.out.println("price is"+ref.price);
		System.out.println("type is"+ref.type);
		System.out.println("takeaway is"+ref.takeaway);

		Juice ref1=new Juice("lychee",500);
		System.out.println("name is:"+ref1.name);
		System.out.println("price is"+ref1.price);
		System.out.println("type is"+ref1.type);
		System.out.println("takeaway is"+ref1.takeaway);

		Juice ref2=new Juice("lychee",500,"juice");
		System.out.println("name is:"+ref2.name);
		System.out.println("price is"+ref2.price);
		System.out.println("type is"+ref2.type);
		System.out.println("takeaway is"+ref2.takeaway);

		Juice ref3=new Juice("lychee",500,"juice",true);
		System.out.println("name is:"+ref3.name);
		System.out.println("price is"+ref3.price);
		System.out.println("type is"+ref3.type);
		System.out.println("takeaway is"+ref3.takeaway);
	}
}