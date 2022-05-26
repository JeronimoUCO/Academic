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
@Table(name = "Student")
public class StudentEntity {
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

	public StudentEntity() {
		setId(0);
		setIdType(IdTypeEntity.create());
		setName("");
		setEmail("");
		setIdNumber("");
	}

	public static StudentEntity create() {
		return new StudentEntity();
	}

	public int getId() {
		return id;
	}

	public StudentEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public IdTypeEntity getIdType() {
		return idType;
	}

	public StudentEntity setIdType(IdTypeEntity idType) {
		this.idType = (idType == null) ? IdTypeEntity.create() : idType;
		return this;
	}

	public String getName() {
		return name;
	}

	public StudentEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getEmail() {
		return email;
	}

	public StudentEntity setIdNumber(String idNumber) {
		this.idNumber = (idNumber == null) ? "" : idNumber.trim();
		return this;
	}

	public StudentEntity setEmail(String email) {
		this.email = (email == null) ? "" : email.trim();
		return this;
	}

}
