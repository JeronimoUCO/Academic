package academic.domain;

import academic.crosscutting.exception.AcademicException;

public class StudentCourseDomain {
	private int id;
	private StudentDomain student;
	private CourseDomain course;
	private StudentCourseStateDomain state;

	public StudentCourseDomain(int id, StudentDomain student, CourseDomain course, StudentCourseStateDomain state) {
		super();
		setId(id);
		setStudent(student);
		setCourse(course);
		setState(state);
	}

	public int getId() {
		return id;
	}

	public StudentDomain getStudent() {
		return student;
	}

	public CourseDomain getCourse() {
		return course;
	}

	public StudentCourseStateDomain getState() {
		return state;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	private void setStudent(StudentDomain student) {
		if (student == null) {
			String message = "No se pueden crear estudiantes vacios";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.student = new StudentDomain(student.getId(), student.getIdNumber(), student.getIdType(), student.getName(),
				student.getEmail());
	}

	private void setCourse(CourseDomain course) {
		if (student == null) {
			String message = "No se pueden crear cursos vacios";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.course = new CourseDomain(course.getId(), course.getSubject(), course.getProfessor(),
				course.getInitialDate(), course.getFinalDate());
	}

	private void setState(StudentCourseStateDomain state) {
		if (state == null) {
			String message = "No se pueden crear estados vacios";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.state = new StudentCourseStateDomain(state.getId(), state.getName());
	}

}
