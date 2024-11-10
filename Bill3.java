class Bill3 {
	public static void main(String[] args){
	String name1= args[0]; //recieving input from the user
	String name2= args[1];
	String name3= args[2];
	int bill= Integer.parseInt(args[3]);

	double bill3=Math.ceil((double)bill/3);

	System.out.println("dear " + name3 + ", " + name2 + " and " + name1 + ", please pay " + bill3 + " Shekels each.");	
	}
	
}