package academic.DTO;


public class ProfessorDTO {
	private int id;
	private String idNumber;
	private IdTypeDTO idType;
	private String name;
	private String email;
	
	public ProfessorDTO(){
	    setId(0);
	    setIdType (IdTypeDTO.create());
	    setName ("");
	    setEmail("");
	    setIdNumber("");
	}
	public static ProfessorDTO create(){
	    return new ProfessorDTO();
	}

	public int getId() {
		return id;
	}

	public ProfessorDTO setId(int id){
	    this.id = (id<0) ? 0: id;
	    return this;
	}

	public IdTypeDTO getIdType() {
		return idType;
	}

	public ProfessorDTO setIdType(IdTypeDTO idType){
	    this.idType=(idType == null)  ? IdTypeDTO.create():idType;  
	    return this;
	}
	                   

	public String getName() {
		return name;
	}

	public ProfessorDTO setName(String name){
		this.name =(name== null) ? "" :name.trim();  
	    return this;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public ProfessorDTO setIdNumber(String idNumber) {
		this.idNumber =(idNumber==null) ? "":idNumber.trim();
		return this;
	}
	
	public ProfessorDTO setEmail(String email) {
		this.email = (email==null) ? "":email.trim() ;
		return this;
	}
	
	
	
	
	
}
