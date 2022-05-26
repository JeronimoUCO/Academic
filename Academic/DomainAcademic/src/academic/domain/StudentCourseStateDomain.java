package academic.domain;

public class StudentCourseStateDomain {
	private int id;
	private String name;

	public StudentCourseStateDomain(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	private void setName(String name) {
		this.name = (name == null) ? "" : name.trim();

	}

}
