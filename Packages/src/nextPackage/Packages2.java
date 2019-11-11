package nextPackage;

public class Packages2 {
	int id;
	String name;
	String type;
	
	public Packages2(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Packages2 [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	

}
