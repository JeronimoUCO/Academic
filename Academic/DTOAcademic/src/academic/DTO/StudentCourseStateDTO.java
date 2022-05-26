package academic.DTO;

public class StudentCourseStateDTO {
	private int id;
	private String name;
	
	
	public StudentCourseStateDTO() {
		setId(0);
		setName("");
	}
	public static StudentCourseStateDTO create(){
	    return new StudentCourseStateDTO();
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public StudentCourseStateDTO setId(int id){
	    this.id = (id<0) ? 0: id;
	    return this;
	}
	public StudentCourseStateDTO setName(String name){
		this.name =(name== null) ? "" :name.trim();  
	    return this;
	}
	
	
	
}
