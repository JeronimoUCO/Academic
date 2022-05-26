package academic.domain;

public class IdTypeDomain {
	private int id;
	private String name;

	public IdTypeDomain(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public static IdTypeDomain create(int id, String name) {
		return new IdTypeDomain(id, name);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = (name == null) ? " " : name.trim();

	}

}
