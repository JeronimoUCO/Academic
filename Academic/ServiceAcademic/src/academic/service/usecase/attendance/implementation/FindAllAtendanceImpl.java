package academic.service.usecase.attendance.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.Entity.AttendanceEntity;
import academic.domain.AttendanceDomain;
import academic.persistence.dao.attendance.AttendanceRepository;
import academic.service.assembler.implementation.AttendanceAssembler;
import academic.service.usecase.attendance.FindAllAttendance;

@Service
public class FindAllAtendanceImpl implements FindAllAttendance {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public List<AttendanceDomain> execute(AttendanceDomain domain) {
		List<AttendanceEntity> attendances = attendanceRepository.findAll();
		return AttendanceAssembler.getAttendanceAssembler().convertListEntityToListDomain(attendances);
	}

}
