package academic.domain;

import java.util.Calendar;
import java.util.Date;

import academic.crosscutting.exception.AcademicException;

public class CourseDomain {
	private int id;
	private SubjectDomain subject;
	private ProfessorDomain professor;
	private Date initialDate;
	private Date finalDate;

	public CourseDomain(int id, SubjectDomain subject, ProfessorDomain professor, Date initialDate, Date finalDate) {
		super();
		setId(id);
		setSubject(subject);
		setProfessor(professor);
		setInitialDate(initialDate);
		setFinalDate(finalDate);
	}

	public int getId() {
		return id;
	}

	public SubjectDomain getSubject() {
		return subject;
	}

	public ProfessorDomain getProfessor() {
		return professor;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	private void setSubject(SubjectDomain subject) {
		if (subject == null) {
			String message = "No se pueden crear materias vacias";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.subject = new SubjectDomain(subject.getId(), subject.getName());
	}

	private void setProfessor(ProfessorDomain professor) {
		if (professor == null) {
			String message = "No se pueden crear un profesor sin información";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		this.professor = new ProfessorDomain(professor.getId(), professor.getIdNumber(), professor.getIdType(),
				professor.getName(), professor.getEmail());
	}

	private void setInitialDate(Date initialDate) {
		this.initialDate = (initialDate == null) ? Calendar.getInstance().getTime() : initialDate;
	}

	private void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	/*
	 * public boolean isOpen() { if(Calendar.getInstance().getTime().getTime() >=
	 * getInitialDate().getTime() && Calendar.getInstance().getTime().getTime()<=
	 * getFinalDate().getTime()) {
	 * 
	 * 
	 * } }
	 */

}
