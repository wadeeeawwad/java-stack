package mohee;

public class project {
	private String name;
	private String desc;
	
	
	
	public project() {
		super();
	
	}
	
	
	
	public project(String name) {
		super();
		this.name = name;
	}



	public project(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}


public  void elevatorPitch(){
	
	System.out.print("name :"+name +"    "+"desc:"+desc +"\n");
}
	

}
