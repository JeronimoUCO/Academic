package academic.service.usecase.attendance.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.Entity.AttendanceEntity;
import academic.domain.AttendanceDomain;
import academic.persistence.dao.attendance.AttendanceRepository;
import academic.service.assembler.implementation.AttendanceAssembler;
import academic.service.usecase.attendance.RegisterAttendance;
import academic.service.usecase.validator.attendance.RegisterAttendanceValidator;

@Service
public class RegisterAttendanceImpl implements RegisterAttendance {

	
	@Autowired
	private AttendanceRepository attendanceRepository;
	
	@Autowired
	private RegisterAttendanceValidator registerAttendanceValidator;
	
	
	@Override
	public void execute(AttendanceDomain domain) {
		
		registerAttendanceValidator.validate(domain);
		AttendanceEntity attendanceEntity=AttendanceAssembler.getAttendanceAssembler().convertDomainToEntity(domain);
		attendanceRepository.save(attendanceEntity);
	}
}
