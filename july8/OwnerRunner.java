class OwnerRunner{
	public static void main(String[] args){
		
		System.out.println("OwnerRunner is running");
		
		Owner ref = new Owner();
		ref.printIntanceVariables();
		System.out.println(" ");
		
		Owner ref1 = new Owner("Hamsa", 93808639, 33146541, "hamsa@10", "hamsa10@gmail.com");
		ref1.printIntanceVariables();
		System.out.println(" ");
		
		Owner ref2 = new Owner();
		ref2.ownerName="Abin";
		ref2.ownerNum=123456;
		ref2.ownerNetworth=96513213;
		ref2.fbId="abin07";
		ref2.ownerEmail="abin07@gmail.com";
		ref2.printIntanceVariables();

	}
}
