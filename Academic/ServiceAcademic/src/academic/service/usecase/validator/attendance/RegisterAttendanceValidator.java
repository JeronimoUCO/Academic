package academic.service.usecase.validator.attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.AttendanceDomain;
import academic.service.usecase.validator.Validator;
import academic.service.usecase.validator.rules.student.StudentExistsRule;

@Service
public class RegisterAttendanceValidator implements Validator<AttendanceDomain> {

	@Autowired
	private StudentExistsRule studentExistsRule;

	public RegisterAttendanceValidator() {
		super();
	}

	@Override
	public void validate(AttendanceDomain domain) {
		studentExistsRule.execute(domain.getStudentCourse().getStudent());
	}
}
