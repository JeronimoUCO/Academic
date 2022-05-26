package academic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentCourseState")

public class StudentCourseStateEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;

	public StudentCourseStateEntity() {
		setId(0);
		setName("");
	}

	public static StudentCourseStateEntity create() {
		return new StudentCourseStateEntity();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public StudentCourseStateEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public StudentCourseStateEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

}
