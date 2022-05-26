package academic.DTO;

public class IdTypeDTO {
	private int id;
	private String name;
	
	public IdTypeDTO(){
	    setId(0);
	    setName ("");
	}
	
	
	public static IdTypeDTO create(){
	    return new IdTypeDTO();
	}
	
	public int getId() {
		return id;
	}
	
	public IdTypeDTO setId(int id){
	    this.id = (id<0)?0: id; 
	    return this;
	}
	
	public String getName() {
		return name;
	}
	
	public IdTypeDTO setName(String name){
	    this.name =(name== null) ? "" :name.trim();  
	    return this;
	}
	
	
	
}
 