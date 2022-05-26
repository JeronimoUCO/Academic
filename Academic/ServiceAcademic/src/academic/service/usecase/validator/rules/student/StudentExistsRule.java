package academic.service.usecase.validator.rules.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.StudentDomain;
import academic.persistence.dao.student.StudentRepository;
import academic.service.usecase.validator.rules.Rule;

@Service
public class StudentExistsRule implements Rule<StudentDomain> {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void execute(StudentDomain domain) {
		studentRepository.findById(domain.getId()).isPresent();

	}

}
