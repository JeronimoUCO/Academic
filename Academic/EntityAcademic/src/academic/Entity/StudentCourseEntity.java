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
@Table(name = "StudentCourse")
public class StudentCourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "student")
	private StudentEntity student;
	@ManyToOne
	@JoinColumn(name = "course")
	private CourseEntity course;
	@ManyToOne
	@JoinColumn(name = "state")
	private StudentCourseStateEntity state;

	public StudentCourseEntity() {
		setId(0);
		setCourse(CourseEntity.create());
		setStudent(StudentEntity.create());
		setState(StudentCourseStateEntity.create());
	}

	public static StudentCourseEntity create() {
		return new StudentCourseEntity();
	}

	public int getId() {
		return id;
	}

	public StudentCourseEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public StudentCourseEntity setStudent(StudentEntity student) {
		this.student = (student == null) ? StudentEntity.create() : student;
		return this;
	}

	public CourseEntity getCourse() {
		return course;
	}

	public StudentCourseEntity setCourse(CourseEntity course) {
		this.course = (course == null) ? CourseEntity.create() : course;
		return this;
	}

	public StudentCourseStateEntity getState() {
		return state;
	}

	public StudentCourseEntity setState(StudentCourseStateEntity state) {
		this.state = (state == null) ? StudentCourseStateEntity.create() : state;
		return this;
	}

}
