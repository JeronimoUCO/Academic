package academic.service.assembler.implementation;

import java.util.List;

import academic.DTO.StudentCourseStateDTO;
import academic.Entity.StudentCourseStateEntity;
import academic.domain.StudentCourseStateDomain;
import academic.service.assembler.Assembler;

public class StudentCourseStateAssembler
		implements Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> {

	private static final Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> INSTANCE = new StudentCourseStateAssembler();

	private StudentCourseStateAssembler() {
		super();
	}

	public static Assembler<StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity> getStudentCourseStateAssembler() {
		return INSTANCE;
	}

	@Override
	public StudentCourseStateDTO convertDomainToDTO(StudentCourseStateDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateEntity convertDomainToEntity(StudentCourseStateDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateDomain convertDTOToDomain(StudentCourseStateDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCourseStateDomain convertEntityToDomain(StudentCourseStateEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentCourseStateDomain> convertListEntityToListDomain(List<StudentCourseStateEntity> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentCourseStateDTO> convertListDomainToListDTO(List<StudentCourseStateDomain> domains) {
		// TODO Auto-generated method stub
		return null;
	}

}
