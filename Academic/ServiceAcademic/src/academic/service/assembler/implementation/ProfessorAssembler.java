package academic.service.assembler.implementation;

import java.util.List;

import academic.DTO.ProfessorDTO;
import academic.Entity.ProfessorEntity;
import academic.crosscutting.exception.AcademicException;
import academic.domain.ProfessorDomain;
import academic.service.assembler.Assembler;

public class ProfessorAssembler implements Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> {

	private static final Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> INSTANCE = new ProfessorAssembler();

	private ProfessorAssembler() {
		super();
	}

	public static Assembler<ProfessorDomain, ProfessorDTO, ProfessorEntity> getProfessorAssembler() {
		return INSTANCE;
	}

	public ProfessorDTO convertDomainToDTO(ProfessorDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio esta nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return ProfessorDTO.create().setId(domain.getId()).setIdNumber(domain.getIdNumber())
				.setIdType(IdTypeAssembler.getIdTypeAssembler().convertDomainToDTO(domain.getIdType()))
				.setName(domain.getName()).setEmail(domain.getEmail());
	}

	@Override
	public ProfessorEntity convertDomainToEntity(ProfessorDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return ProfessorEntity.create().setId(domain.getId()).setIdNumber(domain.getIdNumber())
				.setIdType(IdTypeAssembler.getIdTypeAssembler().convertDomainToEntity(domain.getIdType()))
				.setName(domain.getName()).setEmail(domain.getEmail());
	}

	@Override
	public ProfessorDomain convertDTOToDomain(ProfessorDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new ProfessorDomain(dto.getId(), dto.getIdNumber(),
				IdTypeAssembler.getIdTypeAssembler().convertDTOToDomain(dto.getIdType()), dto.getName(),
				dto.getEmail());
	}

	@Override
	public ProfessorDomain convertEntityToDomain(ProfessorEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new ProfessorDomain(entity.getId(), entity.getIdNumber(),
			IdTypeAssembler.getIdTypeAssembler().convertEntityToDomain(entity.getIdType()), entity.getName(),
			entity.getEmail());
	}

	@Override
	public List<ProfessorDomain> convertListEntityToListDomain(List<ProfessorEntity> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProfessorDTO> convertListDomainToListDTO(List<ProfessorDomain> domains) {
		// TODO Auto-generated method stub
		return null;
	}

}
