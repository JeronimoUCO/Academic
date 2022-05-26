package academic.service.assembler.implementation;

import java.util.List;

import academic.DTO.IdTypeDTO;
import academic.Entity.IdTypeEntity;
import academic.crosscutting.exception.AcademicException;
import academic.domain.IdTypeDomain;
import academic.service.assembler.Assembler;

public class IdTypeAssembler implements Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> {

	private static final Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> INSTANCE = new IdTypeAssembler();

	private IdTypeAssembler() {
		super();
	}

	public static Assembler<IdTypeDomain, IdTypeDTO, IdTypeEntity> getIdTypeAssembler() {
		return INSTANCE;
	}

	@Override
	public IdTypeDTO convertDomainToDTO(IdTypeDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio esta nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);

		}
		return IdTypeDTO.create();
	}

	@Override
	public IdTypeEntity convertDomainToEntity(IdTypeDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un IdTypeEntity a un IdTypeDomain cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return IdTypeEntity.create().setId(domain.getId()).setName(domain.getName());
	}

	@Override
	public IdTypeDomain convertDTOToDomain(IdTypeDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new IdTypeDomain(dto.getId(), dto.getName());

	}

	@Override
	public IdTypeDomain convertEntityToDomain(IdTypeEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new IdTypeDomain(entity.getId(), entity.getName());
	}

	@Override
	public List<IdTypeDomain> convertListEntityToListDomain(List<IdTypeEntity> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdTypeDTO> convertListDomainToListDTO(List<IdTypeDomain> domains) {
		// TODO Auto-generated method stub
		return null;
	}

}
