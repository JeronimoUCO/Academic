package academic.Entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "subject")
	private SubjectEntity subject;
	@ManyToOne
	@JoinColumn(name = "profesor")
	private ProfessorEntity profesor;
	@Column(name = "initialDate")
	private Date initialDate;
	@Column(name = "finalDate")
	private Date finalDate;
	@Column(name = "isOpen")
	private boolean isOpen;

	public CourseEntity() {
		setId(0);
		setSubject(SubjectEntity.create());
		setProfesor(ProfessorEntity.create());
		setInitialDate(Calendar.getInstance().getTime());
		setFinalDate(Calendar.getInstance().getTime());
		setOpen(false);
	}

	public static CourseEntity create() {
		return new CourseEntity();
	}

	public int getId() {
		return id;
	}

	public CourseEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public SubjectEntity getSubject() {
		return subject;

	}

	public CourseEntity setSubject(SubjectEntity subject) {
		this.subject = (subject == null) ? SubjectEntity.create() : subject;
		return this;
	}

	public ProfessorEntity getProfesor() {
		return profesor;
	}

	public CourseEntity setProfesor(ProfessorEntity profesor) {
		this.profesor = (profesor == null) ? ProfessorEntity.create() : profesor;
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
