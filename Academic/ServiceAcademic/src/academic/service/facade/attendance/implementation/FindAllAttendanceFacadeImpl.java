package academic.service.facade.attendance.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import academic.DTO.AttendanceDTO;
import academic.domain.AttendanceDomain;
import academic.service.assembler.implementation.AttendanceAssembler;
import academic.service.facade.attendance.FindAllAttendanceFacade;
import academic.service.usecase.attendance.FindAllAttendance;

@Service
@Transactional
public class FindAllAttendanceFacadeImpl implements FindAllAttendanceFacade {

	@Autowired
	private FindAllAttendance findAllAttendance;

	@Override
	public List<AttendanceDTO> execute(AttendanceDTO dto) {

		AttendanceDomain domain = AttendanceAssembler.getAttendanceAssembler().convertDTOToDomain(dto);
		List<AttendanceDomain> domains = findAllAttendance.execute(domain);
		List<AttendanceDTO> dtos = domains.stream()
				.map(d -> AttendanceAssembler.getAttendanceAssembler().convertDomainToDTO(d))
				.collect(Collectors.toList());

		return dtos;
	}

}
