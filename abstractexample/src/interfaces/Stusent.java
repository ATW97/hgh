package interfaces;

public class Stusent implements printable,interface2 {
	
	private String name;
	private String ID;
	private int age;
	private String parentname;
	/**
	 * @param name
	 * @param iD
	 * @param age
	 * @param parentname
	 */
	public Stusent(String name, String iD, int age, String parentname) {
		super();
		this.name = name;
		ID = iD;
		this.age = age;
		this.parentname = parentname;
	}



	@Override
	public void print() {
		
		System.out.println("name-"+name);
		System.out.println("ID-"+ID);
		System.out.println("age-"+age);
		
	}






	@Override
	public void printparent() {
		// TODO Auto-generated method stub
		System.out.println("Parent name-"+parentname);
		
	}
	
	

}
