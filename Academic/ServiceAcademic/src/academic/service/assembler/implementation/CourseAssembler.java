package academic.service.assembler.implementation;

import java.util.List;

import academic.DTO.CourseDTO;
import academic.Entity.CourseEntity;
import academic.domain.CourseDomain;
import academic.service.assembler.Assembler;

public class CourseAssembler implements Assembler<CourseDomain, CourseDTO, CourseEntity> {

	private static final Assembler<CourseDomain, CourseDTO, CourseEntity> INSTANCE = new CourseAssembler();

	private CourseAssembler() {
		super();
	}

	public static Assembler<CourseDomain, CourseDTO, CourseEntity> getCourseAssembler() {
		return INSTANCE;
	}

	@Override
	public CourseDTO convertDomainToDTO(CourseDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseEntity convertDomainToEntity(CourseDomain domain) {
		return null;

	}

	@Override
	public CourseDomain convertDTOToDomain(CourseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDomain convertEntityToDomain(CourseEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseDomain> convertListEntityToListDomain(List<CourseEntity> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseDTO> convertListDomainToListDTO(List<CourseDomain> domains) {
		// TODO Auto-generated method stub
		return null;
	}

}
