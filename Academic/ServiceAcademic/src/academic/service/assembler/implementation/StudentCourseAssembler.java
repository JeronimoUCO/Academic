package academic.service.assembler.implementation;

import java.util.List;

import academic.DTO.StudentCourseDTO;
import academic.Entity.StudentCourseEntity;
import academic.crosscutting.exception.AcademicException;
import academic.domain.StudentCourseDomain;
import academic.service.assembler.Assembler;

public class StudentCourseAssembler implements Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> {

	private static final Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> INSTANCE = new StudentCourseAssembler();

	private StudentCourseAssembler() {
		super();
	}

	public static Assembler<StudentCourseDomain, StudentCourseDTO, StudentCourseEntity> getStudentCourseAssembler() {
		return INSTANCE;
	}

	@Override
	public StudentCourseDTO convertDomainToDTO(StudentCourseDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un StudentDomain a un StudentDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseDTO.create().setId(domain.getId())
				.setCourse(CourseAssembler.getCourseAssembler().convertDomainToDTO(domain.getCourse()))
				.setStudent(StudentAssembler.getStudentAssembler().convertDomainToDTO(domain.getStudent()));

	}

	@Override
	public StudentCourseEntity convertDomainToEntity(StudentCourseDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un StudentCourseEntity a un StudentCourseDomain cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseEntity.create().setId(domain.getId())
				.setCourse(CourseAssembler.getCourseAssembler().convertDomainToEntity(domain.getCourse()))
				.setStudent(StudentAssembler.getStudentAssembler().convertDomainToEntity(domain.getStudent()));
	}

	@Override
	public StudentCourseDomain convertDTOToDomain(StudentCourseDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un StudentCourseDomain a un StudentCourseDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new StudentCourseDomain(dto.getId(),
				StudentAssembler.getStudentAssembler().convertDTOToDomain(dto.getStudent()),
				CourseAssembler.getCourseAssembler().convertDTOToDomain(dto.getCourse()),
				StudentCourseStateAssembler.getStudentCourseStateAssembler().convertDTOToDomain(dto.getState()));

	}

	@Override
	public StudentCourseDomain convertEntityToDomain(StudentCourseEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un StudentCourseEntity a un StudentCourseDomain cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new StudentCourseDomain(entity.getId(),
				StudentAssembler.getStudentAssembler().convertEntityToDomain(entity.getStudent()),
				CourseAssembler.getCourseAssembler().convertEntityToDomain(entity.getCourse()),
				StudentCourseStateAssembler.getStudentCourseStateAssembler().convertEntityToDomain(entity.getState()));
	}

	@Override
	public List<StudentCourseDomain> convertListEntityToListDomain(List<StudentCourseEntity> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentCourseDTO> convertListDomainToListDTO(List<StudentCourseDomain> domains) {
		// TODO Auto-generated method stub
		return null;
	}
}
