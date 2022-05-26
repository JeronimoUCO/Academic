package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.DTO.SubjectDTO;
import academic.Entity.SubjectEntity;
import academic.crosscutting.exception.AcademicException;
import academic.domain.SubjectDomain;
import academic.service.assembler.Assembler;

public class SubjectAssembler implements Assembler<SubjectDomain, SubjectDTO, SubjectEntity> {

	private static final Assembler<SubjectDomain, SubjectDTO, SubjectEntity> INSTANCE = new SubjectAssembler();

	private SubjectAssembler() {
		super();
	}

	public static Assembler<SubjectDomain, SubjectDTO, SubjectEntity> getSubjectAssembler() {
		return INSTANCE;
	}

	@Override
	public SubjectDTO convertDomainToDTO(SubjectDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SubjectDTO.create().setId(domain.getId()).setName(domain.getName());
	}

	@Override
	public SubjectEntity convertDomainToEntity(SubjectDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectEntity cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SubjectEntity.create(domain.getId(), domain.getName());
	}

	@Override
	public SubjectDomain convertDTOToDomain(SubjectDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un SubjectDTO a un SubjectDomain cuando el dto est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new SubjectDomain(dto.getId(), dto.getName());
	}

	@Override
	public SubjectDomain convertEntityToDomain(SubjectEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un SubjectDomain a un SubjectDTO cuando el dominio est� nulo... ";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return new SubjectDomain(entity.getId(), entity.getName());
	}

	@Override
	public List<SubjectDomain> convertListEntityToListDomain(List<SubjectEntity> entities) {
		List<SubjectDomain> domain = new ArrayList<>();

		for (SubjectEntity entity : entities) {
			domain.add(convertEntityToDomain(entity));
		}
		return domain;
	}

	@Override
	public List<SubjectDTO> convertListDomainToListDTO(List<SubjectDomain> domains) {
		List<SubjectDTO> dtos = new ArrayList<>();

		for (SubjectDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}

}
