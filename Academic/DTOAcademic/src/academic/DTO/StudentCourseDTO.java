package academic.DTO;

public class StudentCourseDTO {
	private int id;
	private StudentDTO student;
	private CourseDTO course;
	private StudentCourseStateDTO state;

	public StudentCourseDTO() {
		setId(0);
		setCourse(CourseDTO.create());
		setStudent(StudentDTO.create());
		setState(StudentCourseStateDTO.create());
	}

	public static StudentCourseDTO create() {
		return new StudentCourseDTO();
	}

	public int getId() {
		return id;
	}

	public StudentCourseDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public StudentDTO getStudent() {
		return student;
	}

	public StudentCourseDTO setStudent(StudentDTO student) {
		this.student = (student == null) ? StudentDTO.create() : student;
		return this;
	}

	public CourseDTO getCourse() {
		return course;
	}

	public StudentCourseDTO setCourse(CourseDTO course) {
		this.course = (course == null) ? CourseDTO.create() : course;
		return this;
	}

	public StudentCourseStateDTO getState() {
		return state;
	}

	public StudentCourseDTO setState(StudentCourseStateDTO state) {
		this.state = (state == null) ? StudentCourseStateDTO.create() : state;
		return this;
	}

}
