package academic.DTO;

public class AttendanceDTO {
	private int id;
	private SessionDTO session;
	private StudentCourseDTO studentCourse;
	private boolean attended;

	public AttendanceDTO() {
		setId(0);
		setSession(SessionDTO.create());
		setStudentCourse(StudentCourseDTO.create());
		setAttended(false);
	}

	public static AttendanceDTO create() {
		return new AttendanceDTO();
	}

	public int getId() {
		return id;
	}

	public AttendanceDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public SessionDTO getSession() {
		return session;
	}

	public AttendanceDTO setSession(SessionDTO session) {
		this.session = (session == null) ? SessionDTO.create() : session;
		return this;
	}

	public StudentCourseDTO getStudentCourse() {
		return studentCourse;
	}

	public AttendanceDTO setStudentCourse(StudentCourseDTO studentCourse) {
		this.studentCourse = (studentCourse == null) ? StudentCourseDTO.create() : studentCourse;
		return this;
	}

	public boolean isAttended() {
		return attended;
	}

	public AttendanceDTO setAttended(boolean attended) {
		this.attended = attended;
		return this;
	}

}
