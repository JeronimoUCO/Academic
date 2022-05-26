package academic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Attendance")
public class AttendanceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "session")
	private SessionEntity session;
	@ManyToOne
	@JoinColumn(name = "studentcourse")
	private StudentCourseEntity studentCourse;
	@Column(name = "attended")
	private boolean attended;

	public AttendanceEntity() {
		setId(0);
		setSession(SessionEntity.create());
		setStudentCourse(StudentCourseEntity.create());
		setAttended(false);
	}

	public static AttendanceEntity create() {
		return new AttendanceEntity();
	}

	public int getId() {
		return id;
	}

	public AttendanceEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;

	}

	public SessionEntity getSession() {
		return session;
	}

	public AttendanceEntity setSession(SessionEntity session) {
		this.session = (session == null) ? SessionEntity.create() : session;
		return this;
	}

	public StudentCourseEntity getStudentCourse() {
		return studentCourse;
	}

	public AttendanceEntity setStudentCourse(StudentCourseEntity studentCourse) {
		this.studentCourse = (studentCourse == null) ? StudentCourseEntity.create() : studentCourse;
		return this;
	}

	public boolean isAttended() {
		return attended;
	}

	public AttendanceEntity setAttended(boolean attended) {
		this.attended = attended;
		return this;
	}
}
