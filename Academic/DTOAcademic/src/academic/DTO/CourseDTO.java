package academic.DTO;

import java.util.Calendar;
import java.util.Date;

public class CourseDTO {
	private int id;
	private SubjectDTO subject;
	private ProfessorDTO profesor;
	private Date initialDate;
	private Date finalDate;
	private boolean isOpen;

	public CourseDTO() {
		setId(0);
		setSubject(SubjectDTO.create());
		setProfesor(ProfessorDTO.create());
		setInitialDate(Calendar.getInstance().getTime());
		setFinalDate(Calendar.getInstance().getTime());
		setOpen(false);
	}

	public static CourseDTO create() {
		return new CourseDTO();
	}

	public int getId() {
		return id;
	}

	public CourseDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public SubjectDTO getSubject() {
		return subject;

	}

	public CourseDTO setSubject(SubjectDTO subject) {
		this.subject = (subject == null) ? SubjectDTO.create() : subject;
		return this;
	}

	public ProfessorDTO getProfesor() {
		return profesor;
	}

	public CourseDTO setProfesor(ProfessorDTO profesor) {
		this.profesor = (profesor == null) ? ProfessorDTO.create() : profesor;
		return this;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = (initialDate == null) ? Calendar.getInstance().getTime() : initialDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = (finalDate == null) ? Calendar.getInstance().getTime() : finalDate;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
