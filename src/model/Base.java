package model;

public class Base {
	//main object - every other object inherits from this one
	private String name;
	private String description;
	
	public Base(String aName, String aDescription) {
		super();
		this.name = aName;
		this.description = aDescription;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String aName) {
		this.name = aName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String aDescription) {
		this.description = aDescription;
	}
	
}