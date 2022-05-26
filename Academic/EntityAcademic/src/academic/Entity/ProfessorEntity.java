package academic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Professor")

public class ProfessorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "idNumber")
	private String idNumber;
	@ManyToOne
	@JoinColumn(name = "idType")
	private IdTypeEntity idType;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;

	public ProfessorEntity() {
		setId(0);
		setIdType(IdTypeEntity.create());
		setName("");
		setEmail("");
		setIdNumber("");
	}

	public static ProfessorEntity create() {
		return new ProfessorEntity();
	}

	public int getId() {
		return id;
	}

	public ProfessorEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public IdTypeEntity getIdType() {
		return idType;
	}

	public ProfessorEntity setIdType(IdTypeEntity idType) {
		this.idType = (idType == null) ? IdTypeEntity.create() : idType;
		return this;
	}

	public String getName() {
		return name;
	}

	public ProfessorEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getEmail() {
		return email;
	}

	public ProfessorEntity setIdNumber(String idNumber) {
		this.idNumber = (idNumber == null) ? "" : idNumber.trim();
		return this;
	}

	public ProfessorEntity setEmail(String email) {
		this.email = (email == null) ? "" : email.trim();
		return this;
	}

}
