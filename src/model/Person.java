package model;

public class Person {
	private String typeId;
	private int id;
	
	public Person(String typeId, int id) {
		super();
		this.typeId = typeId;
		this.id = id;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}





}
