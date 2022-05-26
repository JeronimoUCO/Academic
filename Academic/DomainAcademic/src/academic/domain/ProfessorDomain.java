package academic.domain;

public class ProfessorDomain {
	private int id;
	private String idNumber;
	private IdTypeDomain idType;
	private String name;
	private String email;

	public ProfessorDomain(int id, String idNumber, IdTypeDomain idType, String name, String email) {
		super();
		setId(id);
		setIdNumber(idNumber);
		setIdType(idType);
		setName(name);
		setEmail(email);

	}

	public int getId() {
		return id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public IdTypeDomain getIdType() {
		return idType;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	private void setIdNumber(String idNumber) {
		this.idNumber = (idNumber == null) ? "" : idNumber.trim();
	}

	private void setIdType(IdTypeDomain idType) {
		this.idType = (idType == null) ? new IdTypeDomain(idType.getId(), idType.getName()) : idType;
	}

	private void setName(String name) {
		this.name = (name == null) ? " " : name.trim();

	}

	private void setEmail(String email) {
		this.email = (email == null) ? "" : email.trim();
	}

}
