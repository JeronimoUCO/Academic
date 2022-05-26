package academic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IdType")
public class IdTypeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")

	private int id;
	@Column(name = "name")
	private String name;

	public IdTypeEntity() {
		setId(0);
		setName("");
	}

	public static IdTypeEntity create() {
		return new IdTypeEntity();
	}

	public int getId() {
		return id;
	}

	public IdTypeEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public String getName() {
		return name;
	}

	public IdTypeEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

}
