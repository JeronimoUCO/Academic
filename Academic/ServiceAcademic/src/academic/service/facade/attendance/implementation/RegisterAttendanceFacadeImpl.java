package academic.service.facade.attendance.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import academic.DTO.AttendanceDTO;
import academic.domain.AttendanceDomain;
import academic.service.assembler.implementation.AttendanceAssembler;
import academic.service.facade.attendance.RegisterAttendanceFacade;
import academic.service.usecase.attendance.RegisterAttendance;

@Service
@Transactional
public class RegisterAttendanceFacadeImpl implements RegisterAttendanceFacade {

	@Autowired
	private RegisterAttendance registerAttendance;

	@Override
	public void execute(AttendanceDTO dto) {
		AttendanceDomain domain = AttendanceAssembler.getAttendanceAssembler().convertDTOToDomain(dto);
		registerAttendance.execute(domain);
	}

}
