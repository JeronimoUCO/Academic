package academic.service.assembler.implementation;

import java.util.List;

import academic.DTO.StudentDTO;
import academic.Entity.StudentEntity;
import academic.crosscutting.exception.AcademicException;
import academic.domain.StudentDomain;
import academic.service.assembler.Assembler;

public class StudentAssembler implements Assembler<StudentDomain, StudentDTO, StudentEntity> {

	private static final Assembler<StudentDomain, StudentDTO, StudentEntity> INSTANCE = new StudentAssembler();

	private StudentAssembler() {
		super();
	}

	public static Assembler<StudentDomain, StudentDTO, StudentEntity> getStudentAssembler() {
		return INSTANCE;
	}

	@Override
	public StudentDTO convertDomainToDTO(StudentDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un StudentDomain a un StudentDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentDTO.create().setId(domain.getId()).setName(domain.getName());

	}

	@Override
	public StudentEntity convertDomainToEntity(StudentDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un StudentDomain a un StudentDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentEntity.create().setId(domain.getId()).setIdNumber(domain.getIdNumber())
				.setIdType(IdTypeAssembler.getIdTypeAssembler().convertDomainToEntity(domain.getIdType()))
				.setName(domain.getName()).setEmail(domain.getEmail());
	}

	@Override
	public StudentDomain convertDTOToDomain(StudentDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un StudentDomain a un StudentDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new StudentDomain(dto.getId(), dto.getIdNumber(),
				IdTypeAssembler.getIdTypeAssembler().convertDTOToDomain(dto.getIdType()), dto.getName(),
				dto.getEmail());
	}

	@Override
	public StudentDomain convertEntityToDomain(StudentEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un StudentDomain a un StudentDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new StudentDomain(entity.getId(), entity.getIdNumber(),
			IdTypeAssembler.getIdTypeAssembler().convertEntityToDomain(entity.getIdType()), entity.getName(),
			entity.getEmail());
	}

	@Override
	public List<StudentDomain> convertListEntityToListDomain(List<StudentEntity> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> convertListDomainToListDTO(List<StudentDomain> domains) {
		// TODO Auto-generated method stub
		return null;
	}

}
