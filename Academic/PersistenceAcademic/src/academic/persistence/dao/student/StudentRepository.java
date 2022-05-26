package academic.persistence.dao.student;

import org.springframework.data.jpa.repository.JpaRepository;

import academic.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
