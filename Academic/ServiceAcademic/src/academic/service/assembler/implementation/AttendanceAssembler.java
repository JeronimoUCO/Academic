package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.DTO.AttendanceDTO;
import academic.Entity.AttendanceEntity;
import academic.domain.AttendanceDomain;
import academic.service.assembler.Assembler;

public class AttendanceAssembler implements Assembler<AttendanceDomain, AttendanceDTO, AttendanceEntity> {

	private static final Assembler<AttendanceDomain, AttendanceDTO, AttendanceEntity> INSTANCE = new AttendanceAssembler();

	private AttendanceAssembler() {
		super();
	}

	public static Assembler<AttendanceDomain, AttendanceDTO, AttendanceEntity> getAttendanceAssembler() {
		return INSTANCE;
	}

	@Override
	public AttendanceDTO convertDomainToDTO(AttendanceDomain domain) {
		return null;
	}

	@Override
	public AttendanceEntity convertDomainToEntity(AttendanceDomain domain) {
		return null;
	}

	@Override
	public AttendanceDomain convertDTOToDomain(AttendanceDTO dto) {
		return null;
	}

	@Override
	public AttendanceDomain convertEntityToDomain(AttendanceEntity entity) {
		return null;
	}

	@Override
	public List<AttendanceDomain> convertListEntityToListDomain(List<AttendanceEntity> entities) {
		List<AttendanceDomain> domains = new ArrayList<>();

		for (AttendanceEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<AttendanceDTO> convertListDomainToListDTO(List<AttendanceDomain> domains) {
		List<AttendanceDTO> dtos = new ArrayList<>();

		for (AttendanceDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}

}
