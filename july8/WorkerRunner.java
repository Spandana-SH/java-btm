class WorkerRunner{
	public static void main(String[] args){
		
		System.out.println("WorkerRunner is runing.....");
		
		Worker ref = new Worker();
		ref.printInstanceVariables();
		
		Worker ref1 = new Worker("Spandana","3020SH",23,60000.00,"Software developer");
		ref1.printInstanceVariables();
		
		System.out.println("Updating data...");
		Worker ref2 = new Worker();
		ref2.name="Vedanth";
		ref2.workerId="1605SH";
		ref2.age=13;
		ref2.salary=50000.00;
		ref2.role="backend developer";
		ref2.printInstanceVariables();
	}
}
