package academic.domain;

import java.util.Calendar;
import java.util.Date;

import academic.crosscutting.exception.AcademicException;

public class SessionDomain {
	private int id;
	private CourseDomain course;
	private Date date;

	public SessionDomain(int id, CourseDomain course, Date date) {
		super();
		setId(id);
		setCourse(course);
		setDate(date);
	}

	public int getId() {
		return id;
	}

	public CourseDomain getCourse() {
		return course;
	}

	public Date getDate() {
		return date;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	private void setCourse(CourseDomain course) {
		if (course == null) {
			String message = "No se puede crear un curso sin informacion";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.course = new CourseDomain(course.getId(), course.getSubject(), course.getProfessor(),
				course.getInitialDate(),
				course.getFinalDate());
	}

	private void setDate(Date date) {
		this.date = (date == null) ? Calendar.getInstance().getTime() : date;
	}

}
