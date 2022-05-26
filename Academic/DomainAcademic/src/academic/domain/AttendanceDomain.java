package academic.domain;

import academic.crosscutting.exception.AcademicException;

public class AttendanceDomain {
	private int id;
	private StudentCourseDomain studentCourse;
	private SessionDomain session;
	private boolean attended;

	public AttendanceDomain(int id, StudentCourseDomain studentCourse, SessionDomain session, boolean attended) {
		super();
		setId(id);
		setStudentCourse(studentCourse);
		setSession(session);
		setAttended(attended);
	}

	public int getId() {
		return id;
	}

	public StudentCourseDomain getStudentCourse() {
		return studentCourse;
	}

	public SessionDomain getSession() {
		return session;
	}

	public boolean isAttended() {
		return attended;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	private void setStudentCourse(StudentCourseDomain studentCourse) {
		if (studentCourse == null) {
			String message = "No se puede crear un studentCourse sin informacion";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.studentCourse = new StudentCourseDomain(studentCourse.getId(), studentCourse.getStudent(),
				studentCourse.getCourse(), studentCourse.getState());
	}

	private void setSession(SessionDomain session) {
		if (session == null) {
			String message = "No se puede crear una sesión sin informacion";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.session = new SessionDomain(session.getId(), session.getCourse(), session.getDate());
	}

	private void setAttended(boolean attended) {
		this.attended = attended;
	}

}
