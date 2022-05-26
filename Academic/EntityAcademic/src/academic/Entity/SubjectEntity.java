package academic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
public class SubjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;

	public SubjectEntity() {
		setId(0);
		setName("");
	}

	public static SubjectEntity create() {
		return new SubjectEntity();
	}

	public static SubjectEntity create(int id, String name) {
		return new SubjectEntity();
	}

	public int getId() {
		return id;
	}

	public SubjectEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public String getName() {
		return name;
	}

	public SubjectEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

}
